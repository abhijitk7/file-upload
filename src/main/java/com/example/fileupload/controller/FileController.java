/**
 * 
 */
package com.example.fileupload.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author abhi
 *
 */
@RestController
public class FileController {
	
	//private static final Logger LOGGER = LogManager.getLogger(FileController.class);
	
	@PostMapping(value = "/example2/upload/file",
		     consumes = {MediaType.MULTIPART_FORM_DATA_VALUE},
		     produces = {MediaType.APPLICATION_JSON_VALUE} )
		public ResponseEntity<String> uploadSingleFileExample2(@RequestParam MultipartFile file) {
		  System.out.println("Request contains, File: " + file.getOriginalFilename());
		  // Add your processing logic here
		  return ResponseEntity.ok("Success");
		}
	
	
		@PostMapping(value = "/example1/upload/file",
		     consumes = {MediaType.MULTIPART_FORM_DATA_VALUE},
		     produces = {MediaType.APPLICATION_JSON_VALUE} )
		public ResponseEntity<String> uploadSingleFileExample1(MultipartFile file) {
		System.out.println("Request contains, File: " + file.getOriginalFilename());

		  // TODO: Add file processing logic here
		  return ResponseEntity.ok("Success");
		}

}
