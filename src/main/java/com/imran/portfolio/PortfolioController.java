package com.imran.portfolio;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    // Edit this list to add or change projects. Replace each link with your GitHub URL.
    private final List<Project> projects = List.of(
            new Project("MEDCHAIN", "Backend Developer", "2026",
                    "Disease prediction using machine learning, with blockchain concepts for secure handling of healthcare data. My final year project.",
                    List.of("Python", "Flask", "SQLite", "Machine Learning", "Blockchain"),
                    "https://github.com/your-username/medchain"),
            new Project("Trash to Treasure", "Frontend Developer", "2025",
                    "An e-waste management platform with responsive interfaces. The work was presented as a paper at ICRIT 2025.",
                    List.of("HTML", "CSS", "JavaScript"),
                    "https://github.com/your-username/trash-to-treasure"),
            new Project("Industrial Temperature Monitor", "Project Contributor", "2025",
                    "A real-time temperature monitoring system for industrial settings, built with sensors and microcontrollers.",
                    List.of("Sensors", "Microcontrollers", "IoT"),
                    "https://github.com/your-username/temperature-monitor"));

    private final Map<String, List<String>> skills = Map.of(
            "Languages", List.of("Java", "Python"),
            "Backend", List.of("Spring Boot", "Flask", "Git"),
            "Databases", List.of("Oracle SQL", "MongoDB"),
            "Concepts", List.of("Data Structures & Algorithms", "Database Management", "Problem Solving"));

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Mohamed Imran");
        model.addAttribute("headline", "Backend developer in the making. I build with Java and Spring Boot.");
        model.addAttribute("about",
                "I'm a final-year B.Tech Information Technology student at Erode Sengunthar Engineering College. "
              + "I like backend work: designing databases, writing clean APIs, and solving problems step by step. "
              + "I'm looking for a fresher role where I can keep learning while shipping real software.");
        model.addAttribute("projects", projects);
        model.addAttribute("skills", skills);
        model.addAttribute("email", "mohammedimraan.86674@gmail.com");
        model.addAttribute("phone", "8667432827");
        model.addAttribute("linkedin", "https://www.linkedin.com/in/mohamed-imran-112133389");
        model.addAttribute("github", "https://github.com/your-username");
        return "index";
    }
}
