package com.example.demo.controller;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.DataDetails;
import com.example.demo.entity.DataRepo;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

@RestController
public class DataController {

	@Autowired
  DataRepo service;

	@PostMapping("/upload")
	public String uploadData(@RequestParam("file") MultipartFile file) throws Exception{
		List<DataDetails> dataList = new ArrayList<>();
		InputStream inputStream = file.getInputStream();
		CsvParserSettings setting = new CsvParserSettings();
		setting.setHeaderExtractionEnabled(true);
		CsvParser parser = new CsvParser(setting);
		List<com.univocity.parsers.common.record.Record> parseAllRecords = parser.parseAllRecords(inputStream);
		parseAllRecords.forEach(record ->{
			DataDetails data = new DataDetails();
			data.setCode(record.getString("record"));
			data.setCodeListCode(record.getString("codeListCode"));
			data.setDisplayValue(record.getString("displayValue"));
			data.setFromDate(record.getString("fromDate"));
			data.setLongDescription(record.getString("longDescription"));
			data.setSortingPriority(record.getString("sortingPriority"));
			data.setSource(record.getString("source"));
			data.setToDate(record.getString("toDate"));
			dataList.add(data);
		});
		service.saveAll(dataList);
		return "Upload Completed";
	}
}
