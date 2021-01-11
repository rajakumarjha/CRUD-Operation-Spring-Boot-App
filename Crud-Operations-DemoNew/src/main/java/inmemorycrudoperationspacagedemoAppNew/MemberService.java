package inmemorycrudoperationspacagedemoAppNew;
import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
ArrayList<Member>member=new ArrayList<>();

{
member.add(new Member("1","Raja"));
member.add(new Member("2","Ayush"));
member.add(new Member("3","Nikhil"));
member.add(new Member("4","Arnav"));
member.add(new Member("5","Aditya"));
}

public List<Member> getAllMember() {
	
	return member;
}

public Member getById(String id) {
	
	for(int i=0;i<member.size();i++) {
		if(id.equals(member.get(i).getId())) {
			return member.get(i);
		}
	}
	
	return new Member(id,"Default return Not in memory");
}

public Boolean AddNewMember(Member member2) {
	member.add(member2);
	return true;
}

public Boolean UpdateMember(Member member2) {
	
	for(int i=0;i<member.size();i++) {
		if(member.get(i).getId().equals(member2.getId())) {
			Member m1=member.get(i);
			m1.setName(member2.getName());
			break;
		}
	}
	return true;
}

public Boolean DeleteMember(String id) {
    
	for(int i=0;i<member.size();i++) {
		if(id.equals(member.get(i).getName())) {member.remove(i);break;}
	}
	return true;
}




}
