public class Controller {
    @RequestMapping("/api/v1");
    @GetMapping("/greet")
    public String sayGreet(){
        String s  = "Hey, Hello Learn Git from Telusko";
        return s;

    }
}
