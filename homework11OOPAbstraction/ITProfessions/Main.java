package homework11OOPAbstraction.ITProfessions;

public class Main {
    public static void main(String[] args) {
        ITWorker[] itWorkers = {
                new FullStackDeveloper("Marlen", "Poxosyan",
                        new String[]{"Python", "Flask", "SQL", "JavaScript", "Vue.js", "CSS", "HTML", "Bootstrap"},
                        new String[]{"PyCharm Professional"}
                ),
                new FrontEndDeveloper("Atabek", "Azizyan",
                        new String[]{"JavaScript", "Vue.js", "CSS", "HTML", "Bootstrap"},
                        new String[]{"WebStorm"}
                ),
                new TestAutomationEngineer("Hrant", "Toxatyan",
                        new String[]{"Python", "Selenium WebDriver", "Requests", "PyTest", ""},
                        new String[]{"Aqua"}
                ),
                new ProjectManager("Hrant", "Toxatyan",
                        new String[]{"English", "Communication"}
                ),

        };
        Developer[] developers = {
                new FullStackDeveloper("Alex", "Burkan",
                        new String[]{"Java", "Spring Boot", "SQL", "JavaScript", "Angular", "CSS", "HTML"},
                        new String[]{"IntelliJ IDEA Ultimate"}
                ),
                new FrontEndDeveloper("Atabek", "Azizyan",
                        new String[]{"JavaScript", "React", "CSS", "HTML"},
                        new String[]{"Visual Studio Code"}
                ),
        };

        for (ITWorker itWorker : itWorkers) {
            itWorker.doesWork();
        }
        for (Developer developer : developers) {
            System.out.println(developer.toString() + " healthCheckStatus: " + developer.doHealthCheck());
        }
    }
}
