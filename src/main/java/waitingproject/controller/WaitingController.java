package waitingproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import waitingproject.service.WaitingService;

@RestController
public class WaitingController {
    @Autowired WaitingService waitingService;

//    //등록
//    @PostMapping("/register.do")
//    public boolean register(@RequestBody WaitingDto waitingDto){
//        boolean result = waitingService.register(waitingDto);
//        return result;
//    }
//
//    @GetMapping("/view.do")
//    public ArrayList<WaitingDto> view(){
//
//    }
}