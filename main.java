
package pbl2;

import java.util.Scanner;

public class main {
	static Scanner input = new Scanner(System.in);
	static Student[] student = new Student[100];
	static Professor[] professor = new Professor[100];
	static Subject[] subject = new Subject[100];
	static Employee[] employee = new Employee[100];
	static Major[] major = new Major[10];
	static int curstunum = 40;
	static int curpronum = 12;
	static int cursubject = 24;
	
	static int curempnum = 12;
	static int curmajornum = 4;
	
//객체생성
	{
		student[0] = new Student("이은석","dksk116@gmail.com","010-2588-3049","컴퓨터공학과","100","20160631","데이터구조 고급프로그래밍","4.5 4.5");
		student[1] = new Student("학생1","student1@gmail.com","010-0000-0001","컴퓨터공학과","100","20160601","객체지향프로그래밍 데이터통신","4.5 4.5");
		student[2] = new Student("학생2","student2@gmail.com","010-0000-0002","컴퓨터공학과","100","20160602","알고리즘 운영체제","4.5 4.5");
		student[3] = new Student("학생3","student3@gmail.com","010-0000-0003","컴퓨터공학과","100","20160603","컴퓨터구조 컴퓨터네트워크","4.5 4.5");
		student[4] = new Student("학생4","student4@gmail.com","010-0000-0004","컴퓨터공학과","100","20160604","인터넷응용및실습 소프트웨어공학","4.5 4.5");
		student[5] = new Student("학생5","student5@gmail.com","010-0000-0005","컴퓨터공학과","100","20160605","데이터베이스 웹프로그래밍","4.5 4.5");
		student[6] = new Student("학생6","student6@gmail.com","010-0000-0006","컴퓨터공학과","100","20160606","캡스턴디자인 시스템프로그래밍","4.5 4.5");
		student[7] = new Student("학생7","student7@gmail.com","010-0000-0007","컴퓨터공학과","100","20160607","마이크로프로세서및실험 모바일프로그래밍","4.5 4.5");
		student[8] = new Student("학생8","student8@gmail.com","010-0000-0008","컴퓨터공학과","100","20160608","컴퓨터교과교재연구및지도법 프로그래밍언어론","4.5 4.5");
		student[9] = new Student("학생9","student9@gmail.com","010-0000-0009","컴퓨터공학과","100","20160609","네트워크프로그래밍 임베디드시스템및실습","4.5 4.5");
		student[10] = new Student("학생10","student10@gmail.com","010-0000-0010","정보통신학과","100","20160610","컴퓨터신기술 컴퓨터교과논리및논술","4.5 4.5");
		student[11] = new Student("학생11","student11@gmail.com","010-0000-0011","정보통신학과","100","20160611","프로젝트관리 엔터프라이즈프로그래밍","4.5 4.5");
		student[12] = new Student("학생12","student12@gmail.com","010-0000-0012","정보통신학과","100","20160612","데이터구조 고급프로그래밍","4.5 4.5");
		student[13] = new Student("학생13","student13@gmail.com","010-0000-0013","정보통신학과","100","20160613","객체지향프로그래밍 데이터통신","4.5 4.5");
		student[14] = new Student("학생14","student14@gmail.com","010-0000-0014","정보통신학과","100","20160614","알고리즘 운영체제","4.5 4.5");
		student[15] = new Student("학생15","student15@gmail.com","010-0000-0015","정보통신학과","100","20160615","컴퓨터구조 컴퓨터네트워크","4.5 4.5");
		student[16] = new Student("학생16","student16@gmail.com","010-0000-0016","정보통신학과","100","20160616","인터넷응용및실습 소프트웨어공학","4.5 4.5");
		student[17] = new Student("학생17","student17@gmail.com","010-0000-0017","정보통신학과","100","20160617","데이터베이스 웹프로그래밍","4.5 4.5");
		student[18] = new Student("학생18","student18@gmail.com","010-0000-0018","정보통신학과","100","20160618","캡스턴디자인 시스템프로그래밍","4.5 4.5");
		student[19] = new Student("학생19","student19@gmail.com","010-0000-0019","정보통신학과","100","20160619","마이크로프로세서및실험 모바일프로그래밍","4.5 4.5");
		student[20] = new Student("학생20","student20@gmail.com","010-0000-0020","보안학과","100","20160620","컴퓨터교과교재연구및지도법 프로그래밍언어론","4.5 4.5");
		student[21] = new Student("학생21","student21@gmail.com","010-0000-0021","보안학과","100","20160621","네트워크프로그래밍 임베디드시스템및실습","4.5 4.5");
		student[22] = new Student("학생22","student22@gmail.com","010-0000-0022","보안학과","100","20160622","컴퓨터신기술 컴퓨터교과논리및논술","4.5 4.5");
		student[23] = new Student("학생23","student23@gmail.com","010-0000-0023","보안학과","100","20160623","프로젝트관리 엔터프라이즈프로그래밍","4.5 4.5");
		student[24] = new Student("학생24","student24@gmail.com","010-0000-0024","보안학과","100","20160624","데이터구조 고급프로그래밍","4.5 4.5");
		student[25] = new Student("학생25","student25@gmail.com","010-0000-0025","보안학과","100","20160625","객체지향프로그래밍 데이터통신","4.5 4.5");
		student[26] = new Student("학생26","student26@gmail.com","010-0000-0026","보안학과","100","20160626","알고리즘 운영체제","4.5 4.5");
		student[27] = new Student("학생27","student27@gmail.com","010-0000-0027","보안학과","100","20160627","컴퓨터구조 컴퓨터네트워크","4.5 4.5");
		student[28] = new Student("학생28","student28@gmail.com","010-0000-0028","보안학과","100","20160628","인터넷응용및실습 소프트웨어공학","4.5 4.5");
		student[29] = new Student("학생29","student29@gmail.com","010-0000-0029","보안학과","100","20160629","데이터베이스 웹프로그래밍","4.5 4.5");
		student[30] = new Student("학생30","student30@gmail.com","010-0000-0030","광센서학과","100","20160630","캡스턴디자인 시스템프로그래밍","4.5 4.5");
		student[31] = new Student("학생31","student31@gmail.com","010-0000-0031","광센서학과","100","20160631","마이크로프로세서및실험 모바일프로그래밍","4.5 4.5");
		student[32] = new Student("학생32","student32@gmail.com","010-0000-0032","광센서학과","100","20160632","컴퓨터교과교재연구및지도법 프로그래밍언어론","4.5 4.5");
		student[33] = new Student("학생33","student33@gmail.com","010-0000-0033","광센서학과","100","20160633","네트워크프로그래밍 임베디드시스템및실습","4.5 4.5");
		student[34] = new Student("학생34","student34@gmail.com","010-0000-0034","광센서학과","100","20160634","컴퓨터신기술 컴퓨터교과논리및논술","4.5 4.5");
		student[35] = new Student("학생35","student35@gmail.com","010-0000-0035","광센서학과","100","20160635","프로젝트관리 엔터프라이즈프로그래밍","4.5 4.5");
		student[36] = new Student("학생36","student36@gmail.com","010-0000-0036","광센서학과","100","20160636","데이터구조 고급프로그래밍","4.5 4.5");
		student[37] = new Student("학생37","student37@gmail.com","010-0000-0037","광센서학과","100","20160637","객체지향프로그래밍 데이터통신","4.5 4.5");
		student[38] = new Student("학생38","student38@gmail.com","010-0000-0038","광센서학과","100","20160638","알고리즘 운영체제","4.5 4.5");
		student[39] = new Student("학생39","student39@gmail.com","010-0000-0039","광센서학과","100","20160639","컴퓨터구조 컴퓨터네트워크","4.5 4.5");
	}
	
	{
		professor[0] = new Professor("교수","professor@gmail.com","010-0000-0001","컴퓨터공학과","200","042-0000-0001","데이터구조 고급프로그래밍","학과장","2017년1월1일");
		professor[1] = new Professor("교수1","professor1@gmail.com","010-0000-0002","컴퓨터공학과","200","042-0000-0002","객체지향프로그래밍 데이터통신","조교수","2017년1월1일");
		professor[2] = new Professor("교수2","professor2@gmail.com","010-0000-0003","컴퓨터공학과","200","042-0000-0003","알고리즘 운영체제","부교수","2017년1월1일");
		professor[3] = new Professor("교수3","professor3@gmail.com","010-0000-0004","정보통신학과","200","042-0000-0004","컴퓨터구조 컴퓨터네트워크","학과장","2017년1월1일");
		professor[4] = new Professor("교수4","professor4@gmail.com","010-0000-0005","정보통신학과","200","042-0000-0005","인터넷응용및실습 소프트웨어공학","조교수","2017년1월1일");
		professor[5] = new Professor("교수5","professor5@gmail.com","010-0000-0006","정보통신학과","200","042-0000-0006","데이터베이스 웹프로그래밍","부교수","2017년1월1일");
		professor[6] = new Professor("교수6","professor6@gmail.com","010-0000-0007","보안학과","200","042-0000-0007","캡스턴디자인 시스템프로그래밍","학과장","2017년1월1일");
		professor[7] = new Professor("교수7","professor7@gmail.com","010-0000-0008","보안학과","200","042-0000-0008","마이크로프로세서및실험 모바일프로그래밍","조교수","2017년1월1일");
		professor[8] = new Professor("교수8","professor8@gmail.com","010-0000-0009","보안학과","200","042-0000-0009","컴퓨터교과교재연구및지도법 프로그래밍언어론","부교수","2017년1월1일");
		professor[9] = new Professor("교수9","professor9@gmail.com","010-0000-0010","광센서학과","200","042-0000-0010","네트워크프로그래밍 임베디드시스템및실습","학과장","2017년1월1일");
		professor[10] = new Professor("교수10","professor10@gmail.com","010-0000-0011","광센서학과","200","042-0000-0011","컴퓨터신기술 컴퓨터교과논리및논술","조교수","2017년1월1일");
		professor[11] = new Professor("교수11","professor11@gmail.com","010-0000-0012","광센서학과","200","042-0000-0012","프로젝트관리 엔터프라이즈프로그래밍","부교수","2017년1월1일");	
	}
	
	{
		subject[0] = new Subject("데이터구조",4,"컴퓨터공학과","교수");
		subject[1] = new Subject("고급프로그래밍",4,"컴퓨터공학과","교수");
		subject[2] = new Subject("객체지향프로그래밍",4,"컴퓨터공학과","교수1");
		subject[3] = new Subject("데이터통신",4,"컴퓨터공학과","교수1");
		subject[4] = new Subject("알고리즘",4,"컴퓨터공학과","교수2");
		subject[5] = new Subject("운영체제",4,"컴퓨터공학과","교수2");
		subject[6] = new Subject("컴퓨터구조",4,"정보통신학과","교수3");
		subject[7] = new Subject("컴퓨터네트워크",4,"정보통신학과","교수3");
		subject[8] = new Subject("인터넷응용및실습",3,"정보통신학과","교수4");
		subject[9] = new Subject("소프트웨어공학",3,"정보통신학과","교수4");
		subject[10] = new Subject("데이터베이스",3,"정보통신학과","교수5");
		subject[11] = new Subject("웹프로그래밍",3,"정보통신학과","교수5");
		subject[12] = new Subject("캡스턴디자인",3,"보안학과","교수6");
		subject[13] = new Subject("시스템프로그래밍",3,"보안학과","교수6");
		subject[14] = new Subject("마이크로프로세서및실험",3,"보안학과","교수7");
		subject[15] = new Subject("모바일프로그래밍",3,"보안학과","교수7");
		subject[16] = new Subject("컴퓨터교과교재연구법및지도법",3,"보안학과","교수8");
		subject[17] = new Subject("프로그래밍언어론",3,"보안학과","교수8");
		subject[18] = new Subject("네트워크프로그래밍",3,"광센서학과","교수9");
		subject[19] = new Subject("임베디드시스템및실습",3,"광센서학과","교수9");
		subject[20] = new Subject("컴퓨터신기술",3,"광센서학과","교수10");
		subject[21] = new Subject("컴퓨터교과논리및논술",3,"광센서학과","교수10");
		subject[22] = new Subject("프로젝트관리",3,"광센서학과","교수11");
		subject[23] = new Subject("엔터프라이즈프로그래밍",3,"광센서학과","교수11");
	}
	{
		employee[0] =new Employee("직원1","employee1@gmail.com","010-0000-0001","컴퓨터공학과","150","042-0000-0001","잡무","2017년1월1일");
		employee[1] =new Employee("직원2","employee2@gmail.com","010-0000-0002","컴퓨터공학과","150","042-0000-0002","행정실","2017년1월1일");
		employee[2] =new Employee("직원3","employee3@gmail.com","010-0000-0003","컴퓨터공학과","150","042-0000-0003","행정실","2017년1월1일");
		employee[3] =new Employee("직원4","employee4@gmail.com","010-0000-0004","정보통신학과","150","042-0000-0004","잡무","2017년1월1일");
		employee[4] =new Employee("직원5","employee5@gmail.com","010-0000-0005","정보통신학과","150","042-0000-0005","행정실","2017년1월1일");
		employee[5] =new Employee("직원6","employee6@gmail.com","010-0000-0006","정보통신학과","150","042-0000-0006","조교","2017년1월1일");
		employee[6] =new Employee("직원7","employee7@gmail.com","010-0000-0007","보안학과","150","042-0000-0007","조교","2017년1월1일");
		employee[7] =new Employee("직원8","employee8@gmail.com","010-0000-0008","보안학과","150","042-0000-0008","조교","2017년1월1일");
		employee[8] =new Employee("직원9","employee9@gmail.com","010-0000-0009","보안학과","150","042-0000-0009","잡무","2017년1월1일");
		employee[9] =new Employee("직원10","employee10@gmail.com","010-0000-0010","광센서학과","150","042-0000-0010","행정실","2017년1월1일");
		employee[10] =new Employee("직원11","employee11@gmail.com","010-0000-0011","광센서학과","150","042-0000-0011","조교","2017년1월1일");
		employee[11] =new Employee("직원12","employee12@gmail.com","010-0000-0012","광센서학과","150","042-0000-0012","잡무","2017년1월1일");
		
	}
	{
		major[0] =  new Major("컴퓨터공학과",10,"교수","042-000-0020");
		major[1] =  new Major("정보통신공학과",10,"교수3","042-000-0021");
		major[2] =  new Major("보안학과",10,"교수6","042-000-0022");
		major[3] =  new Major("광센서학과",10,"교수9","042-000-0023");
	}
	
	
	{
		for(int i=40;i<100;i++){
			student[i] =  new Student("","","","","","","","");
		}
	}
	
	{
		for(int i=12;i<100;i++){
			professor[i] =  new Professor("","","","","","","","","");
		}
	}
	
	{
		for(int i =24;i<100;i++){
			subject[i] = new Subject("",0,"","");
		}
		
	}
	
	{
		for(int i=12;i<100;i++){
			employee[i] = new Employee("","","","","","","","");
		}
		
	}
	
	{
		for(int i=4;i<10;i++){
			major[i] = new Major("",0,"","");
		}
		
	}
	
	
	
//객체생성 완료
	//메인메뉴
	public static void main(String[] args){
		boolean i =true;
		int num;
		main DB = new main();
		while(i){
			System.out.println("1.교수관리");
			System.out.println("2.직원관리");
			System.out.println("3.학생관리");
			System.out.println("4.과목관리");
			System.out.println("5.학과관리");
			System.out.println("6.종료");
			System.out.println("선택하실 것을 골라주세요.:");
			num = input.nextInt(); input.nextLine();
			switch(num){
				case 1:
					System.out.println("====교수관리 항목====");
					DB.mainsprofessormeu();
					break;
				case 2:
					System.out.println("====직원관리 항목====");
					DB.mainemployeemenu();
					break;
				case 3:
					System.out.println("====학생관리 항목====");
					DB.mainstudentmenu();
					break;
				case 4:
					System.out.println("====과목관리 항목====");
					DB.subjectmeu();
					break;
				case 5:
					System.out.println("====학과관리 항목====");
					DB.majormenu();
					break;
				case 6:
					i=false;
					break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
//==========================================================학생관리항목============================================================================
	//학생관리 최상위 메뉴
	public void mainstudentmenu(){
		int num = 0;
		System.out.println("1.전체학생출력");
		System.out.println("2.학생추가");
		System.out.println("3.학생삭제");
		System.out.println("4.학생검색");
		System.out.println("선택하실 것을 골라주세요.(이외선택시 상위메뉴):");
		num = input.nextInt(); input.nextLine();
		switch(num){
		case 1:
			printallstu();
			break;
		case 2:
			addstudent();
			break;
		case 3:
			delstudent();
			break;
		case 4:
			searchstumeau();
			break;
		}
	}

	// 전체학생 출력메뉴
	public void printallstu() {
		System.out.println("전체학생을 출력합니다.");
		for (int i = 0; i < curstunum; i++) {
			System.out.println((i+1)+".이름:" + student[i].name + "이메일:" + student[i].email + "전화번호:" + student[i].phonenum
				+ "소속학과:" + student[i].major + "장학금:" + student[i].money + "학번:" + student[i].student_num + "교과목:"
				+ student[i].student_subject + "교과목성적:" + student[i].student_subgrade);
			}
			System.out.println("전체학생 출력을 완료하엿습니다.");
	}
	// 학생추가 메뉴
	public void addstudent(){
		System.out.println("========학생추가 메뉴=========");
		System.out.println("이름:");
		student[curstunum].name=input.nextLine();
		System.out.println("이메일:");
		student[curstunum].email=input.nextLine();
		System.out.println("전화번호:");
		student[curstunum].phonenum=input.nextLine();
		System.out.println("소속학과:");
		student[curstunum].major=input.nextLine();
		recheckmajor(curstunum);
		System.out.println("장학금:");
		student[curstunum].money=input.nextLine();
		System.out.println("학번:");
		student[curstunum].student_num=input.nextLine();
		student[curstunum].student_subject="";
		student[curstunum].student_subgrade="";
		System.out.println("추가가 완료되엇습니다.");
		curstunum++;
	}
	// 학생삭제 메뉴
	public void delstudent(){
		int i=0;
		String arg1,arg2;
		System.out.println("========학생삭제 메뉴=========");
		printallstu();
		System.out.println("몇번째 학생을 삭제하시겟습니까?:");
		i = input.nextInt()-1; input.nextLine();
		arg1 = student[i].major;
		arg2 = student[i].student_subject;
		student[i].name=student[curstunum-1].name;
		student[i].email=student[curstunum-1].email;
		student[i].phonenum=student[curstunum-1].phonenum;
		student[i].major=student[curstunum-1].major;
		student[i].money=student[curstunum-1].money;
		student[i].student_num=student[curstunum-1].student_num;
		student[i].student_subject=student[curstunum-1].student_subject;
		student[i].student_subgrade=student[curstunum-1].student_subgrade;
		recheckmajor3(arg1);
		rechecksubject(arg2);
		curstunum--;
		System.out.println("삭제를 완료햇습니다.");
	}
	// 학생검색기능
	public void searchstumeau(){
		int i;
		String arg;
		System.out.println("========학생검색 메뉴=========");
		System.out.println("찾고싶운 학생의 어느키워드를 선택하시겟습니까?:");
		System.out.println("1.이름");
		System.out.println("2.학번");
		System.out.println("3.이메일");
		System.out.println("4.전화번호");
		i = input.nextInt(); input.nextLine();
		System.out.println("검색어를 입력하세요.:");
		arg =input.nextLine();
		if(i==1){
			for(int num=0;num<curstunum;num++){
				if((student[num].name).equals(arg)){
					changestudent(num);
				}
			}
		}
		else if(i==2){
			for(int num=0;num<curstunum;num++){
				if((student[num].student_num).equals(arg)){
					changestudent(num);
				}
			}
			
		}
		else if(i==3){
			for(int num=0;num<curstunum;num++){
				if((student[num].email).equals(arg)){
					changestudent(num);
				}
			}
		}
		else if(i==4){
			for(int num=0;num<curstunum;num++){
				if((student[num].phonenum).equals(arg)){
					changestudent(num);
				}
			}
				
		}
	}
	//학생수정
	public void changestudent(int i){
		int num;
		System.out.println("========학생수정 메뉴=========");
		System.out.println(".이름:" + student[i].name + ",이메일:" + student[i].email + ",전화번호:" + student[i].phonenum
				+ ",소속학과:" + student[i].major + ",장학금:" + student[i].money + ",학번:" + student[i].student_num + ",교과목:"
				+ student[i].student_subject + ",교과목성적:" + student[i].student_subgrade);
		System.out.println("1.이름");
		System.out.println("2.이메일");
		System.out.println("3.전화번호");
		System.out.println("4.소속학과");
		System.out.println("5.장학금");
		System.out.println("6.학번");
		System.out.println("7.수강과목");
		System.out.println("8.교과목성적");
		System.out.println("위 학생의 어느항목을 수정하시겠습니까?(0입력시 상위메뉴):");
		num = input.nextInt(); input.nextLine();
		if(num==0){
			searchstumeau();
		}
		if(num==1){
			System.out.println("========학생이름수정 메뉴=========");
			System.out.println("수정할 내용:");
			student[i].name = input.nextLine();
			System.out.println("수정되었습니다.");
		}
		if(num==2){
			System.out.println("========학생이메일수정 메뉴=========");
			System.out.println("수정할 내용:");
			student[i].email = input.nextLine();
			System.out.println("수정되었습니다.");
		}
		if(num==3){
			System.out.println("========학생전화번호수정 메뉴=========");
			System.out.println("수정할 내용:");
			student[i].phonenum = input.nextLine();
			System.out.println("수정되었습니다.");
		}
		if(num==4){
			String arg;
			System.out.println("========학생학과수정 메뉴=========");
			arg = student[i].major;
			System.out.println("수정할 내용:");
			student[i].major = input.nextLine();
			recheckmajor2(arg,i);
			System.out.println("수정되었습니다.");
		}
		if(num==5){
			System.out.println("========학생장학금수정 메뉴=========");
			System.out.println("수정할 내용:");
			student[i].money = input.nextLine();
			System.out.println("수정되었습니다.");
		}
		if(num==6){
			System.out.println("========학생학번수정 메뉴=========");
			System.out.println("수정할 내용:");
			student[i].student_num = input.nextLine();
			System.out.println("수정되었습니다.");
		}
		if(num==7){
			System.out.println("========학생수강과목수정 메뉴=========");
			changestusubject(i);
			System.out.println("수정되었습니다.");
		}
		if(num==8){
			System.out.println("========학생성적수정 메뉴=========");
			changegrade(i);
			System.out.println("수정되었습니다.");
		}
	}
	//학과정보수정(학생추가및 삭제시)
	public void recheckmajor(int i/*학생의 정보*/){
			for(int num2=0;num2<curmajornum;num2++){
				if(major[num2].name.equals(student[i].major)){
					major[num2].stunum = major[num2].stunum+1;
				}
			}	
	}
	//학과정보수정(학생정보수정시)
	public void recheckmajor2(String arg,int i){
		for(int num=0;num<curmajornum;num++){
			if(major[num].name.equals(arg)){
					major[num].stunum = major[num].stunum-1;
				for(int num2=0;num2<curmajornum;num2++)
					if(major[num2].name.equals(student[i].major)){
						major[num2].stunum = major[num2].stunum+1;
				}
			}
		}
	}
	//과목정보수정(학생삭제수정시)
	public void recheckmajor3(String arg){
		for(int num=0;num<curmajornum;num++){
			if(major[num].name.equals(arg)){
					major[num].stunum = major[num].stunum-1;
			}
		}
	}
	//과목정보수정(학생삭제수정시)
	public void rechecksubject(String arg){
		String str[] = arg.split(" ");
		int num = str.length;
		for(int i=0;i<cursubject;i++){
			for(int j=0;j<num;j++){
				if(subject[i].subname.equals(str[j])){
					subject[i].substunum = subject[i].substunum - 1;
				}
			}
		}
	}
	//과목정보수정(학생정보수정시)
	public void changestusubject(int i){
		String str[] = student[i].student_subject.split(" ");
		int j,num,selnum;
		int num1 = str.length;
		for(j=0;j<num1;j++){
			System.out.println((j+1)+".과목이름:"+str[j]);
		}
		System.out.println("몇번째 과목을 수정하시겟습니까?");
		num = input.nextInt()-1; input.nextLine();
		for (j = 0; j < cursubject; j++) {
			System.out.println((j+1)+".과목이름:" + subject[j].subname);
		}
		System.out.println("몇번째 과목으로 수정하시겟습니까?");
		selnum = input.nextInt()-1; input.nextLine();
		for(j=0;j < cursubject;j++){
			if(subject[j].subname.equals(str[num])){
				subject[j].substunum = subject[j].substunum-1;
			}
		}
		str[num] = subject[selnum].subname;
		subject[selnum].substunum = subject[selnum].substunum+1;
		student[i].student_subject = "";
		for(j=0;j<num1;j++){
			if(j==num1-1){
				student[i].student_subject += str[j];
			}
			else{
				student[i].student_subject += str[j] + " ";
			}
			
		}
		
	}
	//과목성적수정
	public void changegrade(int i){
		String str[] = student[i].student_subject.split(" ");
		String str2[] = student[i].student_subgrade.split(" ");
		int j,num;
		int num1 = str.length;
		int num2 = str2.length;
		for(j=0;j<num1;j++){
			System.out.println((j+1)+".과목이름:"+str[j]);
		}
		System.out.println("몇번째 과목의 성적을 수정하시겟습니까?");
		num = input.nextInt()-1; input.nextLine();
		System.out.println("몇점로 수정하시겠습니까?(4.5,3.5,2.5):");
		str2[num] = input.nextLine();
		student[i].student_subgrade ="";
		for(j=0;j<num2;j++){
			if(j==num2-1){
				student[i].student_subgrade += str2[j];
			}
			else{
				student[i].student_subgrade += str2[j] + " ";
			}
			
		}
	}
//==========================================================교수관리항목============================================================================	
	//교수관리 최상위 메뉴
	public void mainsprofessormeu(){
		int num = 0;
		System.out.println("1.전체교수출력");
		System.out.println("2.교수추가");
		System.out.println("3.교수삭제");
		System.out.println("4.교수검색");
		System.out.println("선택하실 것을 골라주세요.(이외선택시 상위메뉴):");
		num = input.nextInt(); input.nextLine();
		switch(num){
		case 1:
			printallpro();
			break;
		case 2:
			addprofessor();
			break;
		case 3:
			delprofessor();
			break;
		case 4:
			searchpromeau();
			break;
		}
	}
	//전체교수출력
	public void printallpro(){
		System.out.println("전체교수를 출력합니다.");
		for (int i = 0; i < curpronum; i++) {
			System.out.println((i+1)+".이름:" + professor[i].name + ",이메일:" + professor[i].email + ",전화번호:" + professor[i].phonenum
				+ ",소속학과:" + professor[i].major + ",월급:" + professor[i].money + ",사번:" + professor[i].profes_subphone+ ",강의과목:"
				+ professor[i].profes_subject+ ",직급:" + professor[i].profes_rank+",입사일:"+ professor[i].profes_day);
			}
			System.out.println("전체교수 출력을 완료하엿습니다.");
	}
	//교수추가메뉴
	public void addprofessor(){
		System.out.println("========교수추가 메뉴=========");
		System.out.println("이름:");
		professor[curpronum].name=input.nextLine();
		System.out.println("이메일:");
		professor[curpronum].email=input.nextLine();
		System.out.println("전화번호:");
		professor[curpronum].phonenum=input.nextLine();
		System.out.println("소속학과:");
		professor[curpronum].major=input.nextLine();
		System.out.println("월급:");
		professor[curpronum].money=input.nextLine();
		System.out.println("사번:");
		professor[curpronum].profes_subphone=input.nextLine();
		professor[curpronum].profes_subject="";
		System.out.println("직급:");
		professor[curpronum].profes_rank=input.nextLine();
		System.out.println("입사일:");
		professor[curpronum].profes_day=input.nextLine();
		System.out.println("추가가 완료되엇습니다.");
		curpronum++;
	}
	// 교수삭제 메뉴//삭제시 교과목삭제및 학과삭제 구현하시오.
	public void delprofessor(){
		int i;
		String arg,arg1,arg2,arg3;
		System.out.println("========교수삭제 메뉴=========");
		printallpro();
		System.out.println("몇번째 교수를 삭제하시겟습니까?:");
		i= input.nextInt()-1; input.nextLine();
		arg = professor[i].name;
		arg1 = professor[i].major;
		arg2 = professor[i].profes_subject;
		arg3 = professor[i].profes_rank;
		professor[i].name=professor[curpronum-1].name;
		professor[i].email=professor[curpronum-1].email;
		professor[i].phonenum=professor[curpronum-1].phonenum;
		professor[i].major=professor[curpronum-1].major;
		professor[i].money=professor[curpronum-1].money;
		professor[i].profes_subphone=professor[curpronum-1].profes_subphone;
		professor[i].profes_subject=professor[curpronum-1].profes_subject;
		professor[i].profes_rank=professor[curpronum-1].profes_rank;
		professor[i].profes_day = professor[curpronum-1].profes_day;
		curpronum--;
		repromajor(arg1,arg3);
		reprosubject(arg,arg2);
		System.out.println("삭제를 완료햇습니다.");
	}
	//교수검색기능
	public void searchpromeau(){
		int i;
		String arg;
		System.out.println("========교수검색 메뉴=========");
		System.out.println("찾고싶운 교수의 어느키워드를 선택하시겟습니까?:");
		System.out.println("1.이름");
		System.out.println("2.이메일");
		System.out.println("3.전화번호");
		i = input.nextInt(); input.nextLine();
		System.out.println("검색어를 입력하세요.:");
		arg =input.nextLine();
		if(i==1){
			for(int num=0;num<curpronum;num++){
				if((professor[num].name).equals(arg)){
					changeprofessor(num);
				}
			}
		}
		else if(i==2){
			for(int num=0;num<curpronum;num++){
				if((professor[num].email).equals(arg)){
					changeprofessor(num);
				}
			}
		}
		else if(i==3){
			for(int num=0;num<curpronum;num++){
				if((professor[num].phonenum).equals(arg)){
					changeprofessor(num);
				}
			}
		}
	}
	//교수수정
	public void changeprofessor(int i){
		int num;
		System.out.println("찾은 교수:이름:" + professor[i].name + ",이메일:" + professor[i].email + ",전화번호:" + professor[i].phonenum
				+ ",소속학과:" + professor[i].major + ",월급:" + professor[i].money + ",사번:" + professor[i].profes_subphone+ ",강의과목:"
				+ professor[i].profes_subject+ ",직급:" + professor[i].profes_rank+",입사일:"+ professor[i].profes_day);
		System.out.println("1.이름");
		System.out.println("2.이메일");
		System.out.println("3.전화번호");
		System.out.println("4.소속학과");
		System.out.println("5.월급");
		System.out.println("6.강의과목");
		System.out.println("7.직급");
		System.out.println("8.입사일");
		System.out.println("위 교수의 어느항목을 수정하시겠습니까?(0입력시 상위메뉴):");
		num = input.nextInt(); input.nextLine();
		if(num==0){
			searchpromeau();
		}
		if(num==1){
			System.out.println("========교수이름수정 메뉴=========");
			System.out.println("수정할 내용:");
			professor[i].name = input.nextLine();
			System.out.println("수정되었습니다.");
		}
		if(num==2){
			System.out.println("========교수이메일수정 메뉴=========");
			System.out.println("수정할 내용:");
			professor[i].email = input.nextLine();
			System.out.println("수정되었습니다.");
		}
		if(num==3){
			System.out.println("========교수전화번호수정 메뉴=========");
			System.out.println("수정할 내용:");
			professor[i].phonenum = input.nextLine();
			System.out.println("수정되었습니다.");
		}
		if(num==4){//학과장일시 다른 교수를 학과장으로
			System.out.println("========교수학과수정 메뉴=========");
			repromajor(professor[i].major,professor[i].profes_rank);
			System.out.println("수정할 내용:");
			professor[i].major = input.nextLine();
			professor[i].profes_rank = "교수";
			System.out.println("수정되었습니다.");
		}
		if(num==5){
			System.out.println("========교수월급수정 메뉴=========");
			System.out.println("수정할 내용:");
			professor[i].money = input.nextLine();
			System.out.println("수정되었습니다.");
		}
		if(num==6){
			System.out.println("========교수과목추가 메뉴=========");
			addprofessorsub(i);
			System.out.println("수정되었습니다.");
		}
		if(num==7){
			System.out.println("========교수직책수정 메뉴=========");
			repromajor(professor[i].major,professor[i].profes_rank);
			System.out.println("수정할 내용:");
			professor[i].profes_rank = input.nextLine();
			System.out.println("수정되었습니다.");
		}
		if(num==8){
			System.out.println("========교수입사일수정 메뉴=========");
			System.out.println("수정할 내용:");
			professor[i].profes_day = input.nextLine();
			System.out.println("수정되었습니다.");
		}
	}
	//교수삭제시 학과장변경
	public void repromajor(String arg,String arg2){
		int select;
		if(arg2=="학과장"){
			System.out.println("이교수는 학과장입니다.");
			for(int i=0;i<curpronum;i++){
				if(professor[i].major==arg){
					System.out.println((i+1)+"."+professor[i].name);
				}
			}
			System.out.println("어느 교수를 학과장으로 만드시겠습니까?");
			select = input.nextInt()-1; input.nextLine();
			professor[select].profes_rank="학과장";
			for(int j=0;j<curmajornum;j++){
				if(major[j].name==arg){
					major[j].profes=professor[select].name;
				}
			}
		}
	}
	//교수 삭제시 담당과목에 대한 변화
	public void reprosubject(String arg,String arg1){
		int num;
		for(int i=0;i<curpronum;i++){
			System.out.println((i+1)+".교수:이름:"+professor[i].name);
		}
		System.out.println("어느 교수에게 삭제한 교수과목을 지정해주시겟습니까?");
		num = input.nextInt()-1; input.nextLine();
		professor[num].profes_subject += " " + arg1;
		String str[] = arg1.split(" ");
		int num2 = str.length;
		for(int j=0;j<cursubject;j++){
			for(int u=0;u<num2;u++){
				if(subject[j].subname.equals(str[u])){
					String str2[] = subject[j].subpro.split(" ");
					int num3 = str2.length;
					for(int z=0;z<num3;z++){
						if(str2[z].equals(arg)){
							str2[z] = professor[num].name;
							subject[j].subpro ="";
						}
					}
					for(int z=0;z<num3;z++){
						if(z==0){
							subject[j].subpro += str2[z];
						}
						else{
							subject[j].subpro += " " + str2[z];
						}
					}
				}
			}
		}
	}
	//교수 담당과목추가
	public void addprofessorsub(int num){
		int j;
		System.out.println("교과목을 출력합니다.");
		for(int i=0;i<cursubject;i++){
			System.out.println((i+1)+".과목이름:" + subject[i].subname + ",학생수:" + subject[i].substunum + ",소속학과:" + subject[i].submajor
					+ ",담당교수:" + subject[i].subpro);
		}
		System.out.println("어느교과목을 더 담당하시겟습니까?:");
		j = input.nextInt()-1;  input.nextLine();
		if(professor[num].profes_subject.equals("")){
			professor[num].profes_subject += subject[j].subname;
		}
		else{
			professor[num].profes_subject += " "+ subject[j].subname;
		}
		subject[j].subpro += " " + professor[num].name;
	}
//==========================================================직원,조교 관리항목============================================================================		
	//직원관리 최상위 메뉴
	public void mainemployeemenu(){
		int num = 0;
		System.out.println("1.전체직원출력");
		System.out.println("2.직원추가");
		System.out.println("3.직원삭제");
		System.out.println("4.직원검색");
		System.out.println("선택하실 것을 골라주세요.(이외선택시 상위메뉴):");
		num = input.nextInt(); input.nextLine();
		switch(num){
		case 1:
			printallemp();
			break;
		case 2:
			addemployee();
			break;
		case 3:
			delemployee();
			break;
		case 4:
			searchempmeau();
			break;
		}
	}
	//전체직원출력
	public void printallemp(){
		System.out.println("전체직원을 출력합니다.");
		for (int i = 0; i < curempnum; i++) {
			System.out.println((i+1)+".이름:" + employee[i].name + "이메일:" + employee[i].email + "전화번호:" + professor[i].phonenum
				+ "소속부서:" + employee[i].major + "월급:" + employee[i].money + "사번:" + professor[i].profes_subphone+
				"직급:" + employee[i].empoly_rank+"입사일:"+ employee[i].empoly_day);
			}
			System.out.println("전체직원 출력을 완료하엿습니다.");
	}
	//직원추가메뉴
	public void addemployee(){
		System.out.println("========직원추가 메뉴=========");
		System.out.println("이름:");
		employee[curempnum].name = input.nextLine();
		System.out.println("이메일:");
		employee[curempnum].email = input.nextLine();
		System.out.println("전화번호:");
		employee[curempnum].phonenum = input.nextLine();
		System.out.println("소속부서:");
		employee[curempnum].major = input.nextLine();
		System.out.println("월급:");
		employee[curempnum].money = input.nextLine();
		System.out.println("사번:");
		employee[curempnum].empoly_subphone = input.nextLine();
		System.out.println("직급:");
		employee[curempnum].empoly_rank = input.nextLine();
		System.out.println("입사일:");
		employee[curempnum].empoly_day = input.nextLine();
		System.out.println("추가가 완료되엇습니다.");
		curempnum++;
	}	
	//직원삭제 메뉴
	public void delemployee(){
		int i;
		System.out.println("========직원삭제 메뉴=========");
		printallemp();
		System.out.println("몇번째 직원을 삭제하시겟습니까?:");
		i= input.nextInt()-1;
		employee[i].name = employee[curempnum-1].name;
		employee[i].email = employee[curempnum-1].email;
		employee[i].phonenum = employee[curempnum-1].phonenum;
		employee[i].major = employee[curempnum-1].major;
		employee[i].money = employee[curempnum-1].money;
		employee[i].empoly_subphone = employee[curempnum-1].empoly_subphone;
		employee[i].empoly_rank = employee[curempnum-1].empoly_rank;
		employee[i].empoly_day = employee[curempnum-1].empoly_day;
		curempnum--;
		System.out.println("삭제를 완료햇습니다.");
	}
	//직원검색기능
	public void searchempmeau(){
		int i;
		String arg;
		System.out.println("========직원검색 메뉴=========");
		System.out.println("찾고싶운 직원의 어느키워드를 선택하시겟습니까?:");
		System.out.println("1.이름");
		System.out.println("2.이메일");
		System.out.println("3.전화번호");
		i = input.nextInt(); input.nextLine();
		System.out.println("검색어를 입력하세요.:");
		arg = input.nextLine();
		if(i==1){
			for(int num=0;num<curempnum;num++){
				if((employee[num].name).equals(arg)){
					changeemployee(num);
				}
			}
		}
		else if(i==2){
			for(int num=0;num<curempnum;num++){
				if((employee[num].email).equals(arg)){
					changeemployee(num);
				}
			}
		}
		else if(i==3){
			for(int num=0;num<curempnum;num++){
				if((employee[num].phonenum).equals(arg)){
					changeemployee(num);
				}
			}
		}
	}
	//직원수정
	public void changeemployee(int i){
		int num;
		System.out.println("찾은 직원:이름:" + employee[i].name + "이메일:" + employee[i].email + "전화번호:" + professor[i].phonenum
				+ "소속부서:" + employee[i].major + "월급:" + employee[i].money + "사번:" + professor[i].profes_subphone+
				"직급:" + employee[i].empoly_rank+"입사일:"+ employee[i].empoly_day);
		System.out.println("1.이름");
		System.out.println("2.이메일");
		System.out.println("3.전화번호");
		System.out.println("4.소속학과");
		System.out.println("5.월급");
		System.out.println("6.직급");
		System.out.println("7.입사일");
		System.out.println("위 직원의 어느항목을 수정하시겠습니까?(0입력시 상위메뉴):");
		num = input.nextInt(); input.nextLine();
		if(num==0){
			searchempmeau();
		}
		if(num==1){
			System.out.println("========직원이름수정 메뉴=========");
			System.out.println("수정할 내용:");
			employee[i].name = input.nextLine();
			System.out.println("수정되었습니다.");
		}
		if(num==2){
			System.out.println("========직원이메일수정 메뉴=========");
			System.out.println("수정할 내용:");
			employee[i].email = input.nextLine();
			System.out.println("수정되었습니다.");
		}
		if(num==3){
			System.out.println("========직원전화번호수정 메뉴=========");
			System.out.println("수정할 내용:");
			employee[i].phonenum = input.nextLine();
			System.out.println("수정되었습니다.");
		}
		if(num==4){
			System.out.println("========조교학과수정 메뉴=========");
			System.out.println("수정할 내용:");
			changeempmajor(i);
			System.out.println("수정되었습니다.");
		}
		if(num==5){
			System.out.println("========직원월급수정 메뉴=========");
			System.out.println("수정할 내용:");
			employee[i].money = input.nextLine();
			System.out.println("수정되었습니다.");
		}
		if(num==6){
			System.out.println("========직원직급수정 메뉴=========");
			System.out.println("수정할 내용:");
			employee[i].empoly_rank = input.nextLine();
			System.out.println("수정되었습니다.");
		}
		if(num==7){
			System.out.println("========직원입사일수정 메뉴=========");
			System.out.println("수정할 내용:");
			employee[i].empoly_day = input.nextLine();
			System.out.println("수정되었습니다.");
		}
	}
	//직원학과수정
	public void changeempmajor(int i){
		for(int j=0;j<curmajornum;j++){
			if(major[j].name.equals(employee[i].major)){
			}
			else{
				System.out.println((j+1)+major[j].name);
			}
		}
		int num;
		System.out.println("어느학과로 가시겟습니까?");
		num = input.nextInt()-1; input.nextLine();
		employee[i].major = major[num].name;
	}
//==========================================================과목 관리항목============================================================================
	//과목관리 최상위 메뉴
	public void subjectmeu(){
		int num = 0;
		System.out.println("1.전체과목출력");
		System.out.println("2.과목추가");
		System.out.println("3.과목삭제");
		System.out.println("4.과목검색");
		System.out.println("선택하실 것을 골라주세요.(이외선택시 상위메뉴):");
		num = input.nextInt(); input.nextLine();
		switch(num){
		case 1:
			printallsub();
			break;
		case 2:
			addsubject();
			break;
		case 3:
			delsubject();
			break;
		case 4:
			searchsubject();
			break;
		}
	}
	//전체과목출력
	public void printallsub(){
		System.out.println("전체과목을 출력합니다.");
		for (int i = 0; i < cursubject; i++) {
			System.out.println((i+1)+".과목이름:" + subject[i].subname + ",학생수:" + subject[i].substunum + ",소속학과:" + subject[i].submajor
				+ ",담당교수:" + subject[i].subpro);
			}
			System.out.println("전체과목 출력을 완료하엿습니다.");
	}
	//과목추가메뉴
	public void addsubject(){
		System.out.println("========과목추가 메뉴=========");
		System.out.println("과목이름:");
		subject[cursubject].subname=input.nextLine();
		subject[cursubject].substunum = 0;
		System.out.println("소속학과:");
		subject[cursubject].submajor=input.nextLine();
		System.out.println("담당교수:");
		subject[cursubject].subpro="";
		cursubject++;
	}
	//과목삭제 메뉴//삭제시 학생과 교수 담당 과목 변환.
	public void delsubject(){
		int i;
		String arg;
		System.out.println("========과목삭제 메뉴=========");
		printallsub();
		System.out.println("몇번째 과목을 삭제하시겟습니까?:");
		i= input.nextInt()-1;
		arg = subject[i].subname;
		subject[i].subname = subject[cursubject-1].subname;
		subject[i].substunum = subject[cursubject-1].substunum;
		subject[i].submajor = subject[cursubject-1].submajor;
		subject[i].subpro = subject[cursubject-1].subpro;
		cursubject--;
		delstusubject(arg);
		delprosubject(arg);
		System.out.println("삭제를 완료햇습니다.");
	}
	//과목검색기능
	public void searchsubject(){
		String arg;
		System.out.println("========과목검색 메뉴=========");
		System.out.println("과목이름을 입력하십시오.:");
		arg =input.nextLine();
		for(int num=0;num<cursubject;num++){					
			if((subject[num].subname).equals(arg)){
				changesubject(num);
			}
		}
	}
	//과목수정
	public void changesubject(int i){
		int num;
		String arg;
		arg = subject[i].subname;
		System.out.println("찾은 과목: 과목이름:" + subject[i].subname + ",학생수:" + subject[i].substunum + ",소속학과:" + subject[i].submajor
				+ ",담당교수:" + subject[i].subpro);		
		System.out.println("1.과목이름변경");
		System.out.println("2.수강생 확인");
		System.out.println("3.수강생 추가");
		System.out.println("4.수강생 삭제");
		System.out.println("선택하실 것을 골라주세요.(0입력시 상위메뉴)");
		num = input.nextInt(); input.nextLine();
		if(num==0){
			searchsubject();
		}
		if(num==1){
			System.out.println("========과목수정 메뉴=========");
			resubname(arg,i);
			System.out.println("수정되었습니다.");
		}
		if(num==2){
			System.out.println("========과목수강색확인 메뉴=========");
			printstu(arg);
			System.out.println("수정되었습니다.");
		}
		if(num==3){
			System.out.println("========과목수강생추가 메뉴=========");
			addsubstu(arg);
			System.out.println("수정되었습니다.");
		}
		if(num==4){
			System.out.println("========과목수강생삭제 메뉴=========");
			delsubstu(arg);
			System.out.println("수정되었습니다.");
		}
		
	}
	//교과목삭제시 학생의 교과목삭제
	public void delstusubject(String arg){
			for(int i=0;i<curstunum;i++){
				String str[] = student[i].student_subject.split(" ");
				String str2[] = student[i].student_subgrade.split(" ");
				int num1 = str.length;
				for(int j=0;j<num1;j++){
					if(str[j].equals(arg)){
						student[i].student_subject="";
						student[i].student_subgrade="";
						str[j] = "";
						str2[j] = "";
						for(int num=0;num<num1;num++){
							if(num==0){
								student[i].student_subject = str[num];
								student[i].student_subgrade =str2[num];
							}
							else{
								student[i].student_subject = " " +str[num];
								student[i].student_subgrade = " " + str2[num];
							}
						}
					}
				}
			}
	}
	//교과목삭제시 교수의 교과목삭제
	public void delprosubject(String arg){
		for(int i=0;i<curpronum;i++){
			String str[] = professor[i].profes_subject.split(" ");
			int num = str.length;
			for(int j=0;j<num;j++){
				if(str[j].equals(arg)){
					professor[i].profes_subject = "";
					for(int num1=0;num1<num;num1++){
						str[j] = "";
						if(num==0){
							professor[i].profes_subject = str[num1];
						}
						else{
							professor[i].profes_subject = " " +str[num1];
						}
					}
				}	
			}
		}
	}
	//교과목 이름변경
	public void resubname(String arg,int i){
		System.out.println("변경할 과목이름:");
		subject[i].subname = input.nextLine();
		for(int j=0;j<curstunum;j++){
			String str[] = student[j].student_subject.split(" ");
			int num = str.length;
			for(int j1=0;j1<num;j1++){
				if(str[j1].equals(arg)){
					str[j1] = subject[i].subname;
					student[j].student_subject = "";
					for(int u=0;u<num;u++){
						if(u==0){
							student[j].student_subject = str[u];
						}
						else{
							student[j].student_subject += " "+str[u];
						}
					}
				}
			}
		}
		for(int j=0;j<curpronum;j++){
			String str2[] = professor[j].profes_subject.split(" ");
			int num1 = str2.length;
			for(int j1=0;j1<num1;j1++){
				if(str2[j1].equals(arg)){
					str2[j1] = subject[i].subname;
					professor[j].profes_subject="";
					for(int u=0;u<num1;u++){
						if(u==0){
							professor[j].profes_subject = str2[u];
						}
						else{
							professor[j].profes_subject += " " + str2[u];
						}
					}
				}
			}
		}
	}
	//학생출력
	public void printstu(String arg){
		for(int i=0;i<curstunum;i++){
			String str[] = student[i].student_subject.split(" ");
			int num = str.length;
			for(int j=0;j<num;j++){
				if(str[j].equals(arg)){
					System.out.println((i+1)+".이름:" + student[i].name + "이메일:" + student[i].email + "전화번호:" + student[i].phonenum
							+ "소속학과:" + student[i].major + "장학금:" + student[i].money + "학번:" + student[i].student_num + "교과목:"
							+ student[i].student_subject + "교과목성적:" + student[i].student_subgrade);
				}
			}
		}
		System.out.println("이과목을 듣는 학생들입니다.");
	}
	//학생추가
	public void addsubstu(String arg){
		for(int i=0;i<curstunum;i++){
			System.out.println((i+1)+".이름:" + student[i].name + "이메일:" + student[i].email + "전화번호:" + student[i].phonenum
					+ "소속학과:" + student[i].major + "장학금:" + student[i].money + "학번:" + student[i].student_num + "교과목:"
					+ student[i].student_subject + "교과목성적:" + student[i].student_subgrade);
		}
		System.out.println("몇번째 학생을 추가하시겟습니까?:");
		int select = input.nextInt() - 1; input.nextLine();
		student[select].student_subject += " "+arg;
		student[select].student_subgrade += " 0";
	}
	//학생삭제
	public void delsubstu(String arg){
		printstu(arg);
		System.out.println("몇번째 학생을 삭제하시겟습니까?:");
		int select = input.nextInt() - 1; input.nextLine();
		String str[] = student[select].student_subject.split(" ");
		String str2[] = student[select].student_subgrade.split(" ");
		int num =str.length;
		for(int num2=0;num2<num;num2++){
			if(str[num2].equals(arg)){
				student[select].student_subject="";
				student[select].student_subgrade="";
				str[num2]="";
				str2[num2]="";
				for(int j=0;j<num;j++){
					if(j==0){
						student[select].student_subject += str[j];
						student[select].student_subgrade += str2[j];
					}
					else{
						student[select].student_subject += " "+str[j];
						student[select].student_subgrade += " "+str2[j];
						
					}
				}
			}
		}
	}
//==========================================================학과 관리항목============================================================================	
	//학과관리 최상위 메뉴
	public void majormenu(){
		int num = 0;
		System.out.println("1.전체학과출력");
		System.out.println("2.학과추가");
		System.out.println("3.학과삭제");
		System.out.println("4.학과검색");
		System.out.println("선택하실 것을 골라주세요.(다른것을 입력시 상위메뉴):");
		num = input.nextInt(); input.nextLine();
		switch(num){
			case 1:
				printallmajor();
				break;
			case 2:
				addmajor();
				break;
			case 3:
				delmajor();
				break;
			case 4:
				searchmajor();
				break;
		}
	}
	//전체학과출력
	public void printallmajor(){
		System.out.println("전체학과를 출력합니다.");
		for (int i = 0; i < curmajornum; i++) {
			System.out.println((i+1)+".학과이름:" + major[i].name + ",학생수:" +major[i].stunum + ",담당교수:" + major[i].profes
				+ ",학과번호:" + major[i].phone);
			}
			System.out.println("전체학과 출력을 완료하엿습니다.");
	}
	//학과추가메뉴 
	public void addmajor(){
		System.out.println("========학과추가 메뉴=========");
		System.out.println("학과이름:");
		major[curmajornum].name=input.nextLine();
		major[curmajornum].stunum = 0;
		major[curmajornum].profes="";
		System.out.println("학과번호:");
		major[curmajornum].phone=input.nextLine();
		curmajornum++;
	}	
	//학과삭제 메뉴
	public void delmajor(){
		int i;
		String arg;
		int num;
		System.out.println("========학과삭제 메뉴=========");
		printallmajor();
		System.out.println("몇번째 학과를 삭제하시겟습니까?:");
		i= input.nextInt()-1;
		arg = major[i].name;
		num = major[i].stunum;
		major[i].name = major[curmajornum-1].name;
		major[i].stunum = major[curmajornum-1].stunum;
		major[i].profes = major[curmajornum-1].profes;
		major[i].phone = major[curmajornum-1].phone;
		curmajornum--;
		for (int j = 0; j < curmajornum; j++) {
			if(major[j].name.equals(arg)){
			}
			else{
				System.out.println((j+1)+".학과이름:" + major[j].name);
			}
		}
		System.out.println("어느 학과로 변경하시겟습니까?");
		int num1;
		num1 = input.nextInt()-1; input.nextLine();
		changestumajor(arg,num,num1);
		changepromajor(arg,num1);
		System.out.println("삭제를 완료햇습니다.");
	}	
	//학과검색기능
	public void searchmajor(){
		String arg;
		System.out.println("========학과검색 메뉴=========");
		System.out.println("학과이름을 입력하십시오.:");
		arg =input.nextLine();
		for(int num=0;num<curmajornum;num++){					
			if((major[num].name).equals(arg)){
				changemajor(num);
			}
		}
	}	
	//학과수정
	public void changemajor(int i){
		int num;
		String arg;
		arg = major[i].name;
		System.out.println("찾은 학과: 학과이름:" + major[i].name + ",학생수:" +major[i].stunum + ",담당교수:" + major[i].profes
				+ ",학과번호:" + major[i].phone);	
		System.out.println("1.학과이름 변경");
		System.out.println("2.학과담당교수 변경");
		System.out.println("3.학과번호 변경");
		System.out.println("검색어를 입력하세요.:(0입력시 상위메뉴)");
		num = input.nextInt(); input.nextLine();
		if(num==0){
			searchmajor();
		}
		if(num==1){
			System.out.println("========학과이름변경 메뉴=========");
			System.out.println("변경할 학과이름:");
			major[i].name = input.nextLine();
			changemajorname(arg,i);
			System.out.println("수정되었습니다.");
		}
		if(num==2){
			System.out.println("========학과담당교수변경 메뉴=========");
			changemainpro(arg,i);
			System.out.println("수정되었습니다.");
		}
		if(num==3){
				System.out.println("========학과번호변경 메뉴=========");
				major[i].phone = input.nextLine();
				System.out.println("수정되었습니다.");
		}
	}	
	//학과삭제시 학생학과변경
	public void changestumajor(String arg,int i,int num){
		for(int j=0;j<curstunum;j++){
			if(student[j].major.equals(arg)){
				student[j].major = major[num].name;
			}
		}
		major[num].stunum += i;
	}
	//학과삭제시 교수학과변경
	public void changepromajor(String arg,int num){
		for(int j=0;j<curpronum;j++){
			if(professor[j].major.equals(arg)){
				professor[j].major = major[num].name;
				if(professor[j].major.equals("학과장")){
					professor[j].major="교수";
				}
			}
		}
	}
	//학과삭제시 직원학과변경
	public void changeempmajor(String arg,int num){
		for(int j=0;j<curempnum;j++){
			if(employee[j].major.equals(arg)){
				employee[j].major = major[num].name;
			}
		}
	}
	//학과이름변경시 학과에 있는 사람들을 모두 변경
	public void changemajorname(String arg,int i){
		for(int j=0;j<curstunum;j++){
			if(student[j].major.equals(arg)){
				student[j].major = major[i].name;
			}
		}
		for(int j=0;j<curpronum;j++){
			if(professor[j].major.equals(arg)){
				professor[j].major = major[i].name;
			}
		}
		for(int j=0;j<curempnum;j++){
			if(employee[j].major.equals(arg)){
				employee[j].major = major[i].name;
			}
		}
	}
	//학과장변경
	public void changemainpro(String arg, int i){
		for(int j=0;j<curpronum;j++){
			if(professor[j].profes_rank.equals("학과장")){
				if(professor[j].major.equals(arg)){
					professor[j].profes_rank = "교수";
				}
			}
			else{
				System.out.println((j+1)+"."+professor[j].name); 
			}
			
			}
		System.out.println("어느교수를 학과장으로 만드시겠습니까?"); 
		int num;
		num = input.nextInt()-1; input.nextLine();
		if(professor[num].major.equals(arg)){
			professor[num].profes_rank = "학과장";
			major[i].profes = professor[num].name;
		}
		else{
			professor[num].profes_rank = "학과장";
			major[i].profes = professor[num].name;
			professor[num].major = major[i].name;
		}
	}
}//class의끝