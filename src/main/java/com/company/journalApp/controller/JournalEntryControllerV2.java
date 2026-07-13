package com.company.journalApp.controller;

import com.company.journalApp.entity.JournalEntry;
import com.company.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;


@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;
    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry ) {
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveMyEntry(myEntry);
        return true;
    }

}