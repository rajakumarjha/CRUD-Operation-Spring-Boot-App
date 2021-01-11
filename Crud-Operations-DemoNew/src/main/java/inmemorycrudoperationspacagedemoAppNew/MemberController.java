package inmemorycrudoperationspacagedemoAppNew;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	
	// In below line dependency injection happened!!
	@Autowired
	
	private MemberService MemberServ;
	
	
	/*Below method will return list of object that will automatically be converted to JSON */
	
	@RequestMapping("/")
	public List<Member> getAllMember() {
		return MemberServ.getAllMember();
		
	}
	
	// Using pathVariable annotation we pass that id to the method.{id} represents that {} is variable
	@RequestMapping("/{id}")
	public Member getById(@PathVariable String id) {
		return MemberServ.getById(id);
		
	}
	
	
	/*This requestBody will tell the spring that topic must be taken from JSON send to post it*/
	@RequestMapping(method=RequestMethod.POST,value="/add")
	public Boolean AddNewMember(@RequestBody Member Member) {
		return MemberServ.AddNewMember(Member);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/update")
	public Boolean UpdateMember(@RequestBody Member Member) {
		return MemberServ.UpdateMember(Member);
	}
	
	@RequestMapping("/del/{id}")
	public Boolean DeleteMember(@PathVariable String id) {
		return MemberServ.DeleteMember(id);
	}
	
	
}
