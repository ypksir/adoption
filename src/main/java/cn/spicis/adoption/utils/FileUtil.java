package cn.spicis.adoption.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Date;
import java.util.UUID;

public class FileUtil {
    public static String uploadImage(MultipartFile file, boolean isRandomName) {

        try {
            String[] typeImg={"gif","jpeg","png","jpg"};

            if (file != null) {
                String origName = file.getOriginalFilename();// 文件原名称
                String type = origName.indexOf(".") != -1 ? origName.substring(origName.lastIndexOf(".") + 1, origName.length()) : null;
                if (type != null) {
                    boolean booIsType = false;
                    for (int i = 0; i < typeImg.length; i++) {
                        if (typeImg[i].equals(type.toLowerCase())) {
                            booIsType = true;
                        }
                    }

                    //类型正确
                    if (booIsType) {
                        //存放图片文件的路径
                        String path = "/Users/suicanghai/Documents/study/IDEASpace/adoption/src/main/resources/static/image";
                        //是否随机名称
                        String directStr = TimeUtil.formatDate(new Date(), "yyyy-MM-dd");
                        if(isRandomName){
                            origName = UUID.randomUUID().toString() + origName.substring(origName.lastIndexOf("."));
                        }
                        //判断是否存在目录
                        File direct = new File(path + "/" + directStr);
                        if (!direct.exists()) {
                            direct.mkdirs();//创建目录
                        }
                        File targetFile = new File(path + "/" + directStr + "/" + origName);
                        //上传
                        file.transferTo(targetFile);
                        return directStr + "/" + origName;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
