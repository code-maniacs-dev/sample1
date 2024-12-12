public class Controller {
    @RequestMapping("/api/v1");
    @GetMapping("/greet")
    public String sayGreet(){
        return "Hey, Hello Learn Git from Telusko";
        
    }
}
