package cn.spicis.adoption.controller;

import cn.spicis.adoption.domain.PetsInfos;
import cn.spicis.adoption.domain.PetsPhotos;
import cn.spicis.adoption.service.PetsInfosService;
import cn.spicis.adoption.service.PetsPhotosService;
import cn.spicis.adoption.utils.FileUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/sys")
public class PetsInfoCollection {

    @Resource
    private PetsInfosService petsInfosService;

    @Resource
    private PetsPhotosService petsPhotosService;

    @RequestMapping("/createPetInfo")
    public String index(Model model) {
        model.addAttribute("petsInfos", new PetsInfos());
        return "/createPetInfo";
    }

    @ResponseBody
    @RequestMapping("/getPetsInfos")
    public PageInfo getPetsInfos(@RequestParam(value = "page", defaultValue = "1") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        List<PetsInfos> list = petsInfosService.getAll();
        PageInfo pageInfo = new PageInfo(list);

        return pageInfo;
    }

    @RequestMapping("/savePetInfo")
    public String savePetInfo(@ModelAttribute PetsInfos petsInfo) {

        petsInfo.setInsertTime(new Timestamp(new Date().getTime()));
        petsInfo.setStatus(0);

        MultipartFile[] file = petsInfo.getFile();

        int result = petsInfosService.insert(petsInfo);

        if (result == 1) {
            int petId = petsInfo.getId();
            if (file != null && file.length > 0) {
                List<PetsPhotos> petsPhotos = new ArrayList<PetsPhotos>();
                for (int i = 0; i < file.length; i++) {
                    if (!file[i].isEmpty()) {
                        String fileString = FileUtil.uploadImage(file[i], true);
                        PetsPhotos petsPhoto = new PetsPhotos();
                        petsPhoto.setPetType(1); //默认猫
                        petsPhoto.setPetId(petId);
                        petsPhoto.setPhotoAddress(fileString);
                        petsPhoto.setInsertTime(new Timestamp(new Date().getTime()));
                        petsPhoto.setStatus(0);
                        petsPhotos.add(petsPhoto);
                    }
                }
                if (petsPhotos.size() > 0) {
                    petsPhotosService.insertCodeBatch(petsPhotos);
                }
            }
        }

        return "/createPetSuccess";
    }
}
