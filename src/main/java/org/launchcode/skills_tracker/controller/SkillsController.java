package org.launchcode.skills_tracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

   @GetMapping("/")
    public String showListItems(){
        String html = "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list: </h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
        return html;
    }

    @GetMapping("form")
    public String displayForm(){
        String html = "<form method='post'>" +
                "<label>Name: </label> " +
                "<input type=text name = 'name' /> <br />" +
                "<label> My first favorite language: </label><br />" +
                "<select name = 'firstlang'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +

                "<br /><label> My second favorite language: </label><br />" +
                "<select name = 'secondlang'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +

                "<br /><label> My third favorite language: </label><br />" +
                "<select name = 'thirdlang'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +

                "<br /> <button type='submit'>Submit</button>"+

                "</form>";
        return html;
    }

    @PostMapping("form")
    public String submitForm(@RequestParam String name, @RequestParam String firstlang, @RequestParam String secondlang, @RequestParam String thirdlang){
       String html = "<h1> Skill tracker for: "+ name + "</h1>" +
               "<ol>" +
               "<li>" + firstlang + "</li>" +
               "<li>" + secondlang + "</li>" +
               "<li>" + thirdlang + "</li>" +
               "</ol>";
       return html;
    }
}
