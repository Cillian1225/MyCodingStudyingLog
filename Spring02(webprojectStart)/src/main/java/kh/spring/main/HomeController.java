package kh.spring.main;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.spring.dao.PersonDAO;
import kh.string.dto.PersonDTO;


//Spring -> Light Weight /POJO(Plain Old Java Object)
//public class ~~�̷������� ǥ��

@Controller // XML에서 controller를 거쳐서 읽게됨.
public class HomeController {
	//MVC2의 if와 같음
	
	@Autowired
	private PersonDAO dao;
	
	@RequestMapping("/")
	public String home() { // '/'의 경우에는
		//request.getParam... MVC2
		//dao.~~~?            MVC2
		//1)jsp이름을 붙여준다.� 2)�������� ��������Ѵ�.
		return "home"; //String으로 보내면 포워딩이다.
	}
	@RequestMapping("inputForm")
	
	public String inputForm() {

		return "inputForm";
	}

	
	//personDTO에 대한 Dispatcher의 행동
	//PersonDTO dto = new PersonDTO();를 만들어냄
	//************default 생성자 /setter를 만들어놔야 사용이 가능하다.
	//dto.setName(request.getParameter("name"); 가 있는지 시도해본다.
	//dto.setContact(request.getParameter("contact"); 가 있는지 시도해본다.
	
	@RequestMapping("inputProc")
	public String inputProc(PersonDTO dto) throws Exception{
		
//		String name= request.getParameter("name");
//		String contact =request.getParameter("contact");
//		System.out.println("확인");
//		reqeust.getParameter..로 받아야하는데 매개변수가 없음
	
		System.out.println(dto.getName()+ " : " + dto.getContact());
		int result = dao.insert(dto);
		
		return "redirect:/"; //포워딩이아닌 리다이렉팅을 해야하는 부분이다.
		//클라이언트 여기다가 주소창에다가 니가 홈이라고써 
	}
	@RequestMapping("outputForm")
	public String outputForm(Model model) throws Exception{
	
		List<PersonDTO>list = dao.selectAll(); //String으로 쓰는방법 1번 메이져,미세한 성능의 우위
		model.addAttribute("list", list); //모델이 필요할때는 모델 매개변수를 만들어서 리턴될때 모델을 가져간다.
		
		return "outputForm";//리턴하면 걍 포워드라고 했는데 여기도 해당함.
	
		
		/*public ModelAndView outputForm(Model model) {  2번. ModelAndView를 사용하는 마이너한 방법.
		 * ModelAndView mav = new ModelAndView();
		 * try { List<PersonDTO>list =dao.selectAll();
		 *  mav.addObject("list",list);
		 * 
		 * }catch(Exception e){
		 * e.printStackTrace();
		 * mav.setViewName("error");
		 * }
		 * return mav;//리턴하면 걍 포워드라고 했는데 여기도 해당함.
		 * 
		 * }
		 */
	
	}
	@RequestMapping("modifyProc")
	public String modifyProc(PersonDTO dto) throws Exception {
		System.out.println("수정요청확인");
		int result = dao.modify(dto);
		return "redirect:outputForm";
		
	}
	
	@RequestMapping("deleteProc")
	public String deleteProc(int delid) throws Exception {
		System.out.println("삭제요청확인");
		int result = dao.delete(delid);
		return "redirect:outputForm";
		
	}
	
	
	
	
	@ExceptionHandler
	public String exceptionHandler(Exception e) { //예외 처리용 메서드 만들기  예외전가된걸 얘기 dispatcher가기전에받는다.
		e.printStackTrace();
		return "error";
	}
	


}
