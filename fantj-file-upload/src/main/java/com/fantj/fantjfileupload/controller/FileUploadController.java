package com.fantj.fantjfileupload.controller;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by Fant.J.
 * 2017/12/6 9:44
 */
@RestController
public class FileUploadController {
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public  String handleFileUpload(@RequestParam("file")MultipartFile file) throws IOException {
        byte[] bytes = file.getBytes();
        File file1 = new File(file.getOriginalFilename());
        FileCopyUtils.copy(bytes,file1);
        return file1.getAbsolutePath();
    }
}
