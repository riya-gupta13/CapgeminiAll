package com.cpg.pixogramspring.services;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cpg.pixogramspring.entities.Content;
import com.cpg.pixogramspring.repositories.ContentRepository;

@Service
public class ContentService {
	
	@Autowired
	ContentRepository contentRepository;
	
	public Content uploadFile(MultipartFile file, String caption) throws IllegalStateException, IOException {
		long append= System.nanoTime();
		String filen=file.getOriginalFilename();
		String filename= append + "_" + filen;
		String filetype=file.getContentType();
		file.transferTo(new File("E:\\Sprint\\uploads\\"+file.getOriginalFilename()));
		try {
		Content content=new Content(caption,filename,filetype);
		//content.setFile(file);
		return contentRepository.save(content);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
