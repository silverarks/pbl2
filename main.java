
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
	
//��ü����
	{
		student[0] = new Student("������","dksk116@gmail.com","010-2588-3049","��ǻ�Ͱ��а�","100","20160631","�����ͱ��� ������α׷���","4.5 4.5");
		student[1] = new Student("�л�1","student1@gmail.com","010-0000-0001","��ǻ�Ͱ��а�","100","20160601","��ü�������α׷��� ���������","4.5 4.5");
		student[2] = new Student("�л�2","student2@gmail.com","010-0000-0002","��ǻ�Ͱ��а�","100","20160602","�˰��� �ü��","4.5 4.5");
		student[3] = new Student("�л�3","student3@gmail.com","010-0000-0003","��ǻ�Ͱ��а�","100","20160603","��ǻ�ͱ��� ��ǻ�ͳ�Ʈ��ũ","4.5 4.5");
		student[4] = new Student("�л�4","student4@gmail.com","010-0000-0004","��ǻ�Ͱ��а�","100","20160604","���ͳ�����׽ǽ� ����Ʈ�������","4.5 4.5");
		student[5] = new Student("�л�5","student5@gmail.com","010-0000-0005","��ǻ�Ͱ��а�","100","20160605","�����ͺ��̽� �����α׷���","4.5 4.5");
		student[6] = new Student("�л�6","student6@gmail.com","010-0000-0006","��ǻ�Ͱ��а�","100","20160606","ĸ���ϵ����� �ý������α׷���","4.5 4.5");
		student[7] = new Student("�л�7","student7@gmail.com","010-0000-0007","��ǻ�Ͱ��а�","100","20160607","����ũ�����μ����׽��� ��������α׷���","4.5 4.5");
		student[8] = new Student("�л�8","student8@gmail.com","010-0000-0008","��ǻ�Ͱ��а�","100","20160608","��ǻ�ͱ������翬���������� ���α׷��־���","4.5 4.5");
		student[9] = new Student("�л�9","student9@gmail.com","010-0000-0009","��ǻ�Ͱ��а�","100","20160609","��Ʈ��ũ���α׷��� �Ӻ����ý��۹׽ǽ�","4.5 4.5");
		student[10] = new Student("�л�10","student10@gmail.com","010-0000-0010","��������а�","100","20160610","��ǻ�ͽű�� ��ǻ�ͱ������׳��","4.5 4.5");
		student[11] = new Student("�л�11","student11@gmail.com","010-0000-0011","��������а�","100","20160611","������Ʈ���� ���������������α׷���","4.5 4.5");
		student[12] = new Student("�л�12","student12@gmail.com","010-0000-0012","��������а�","100","20160612","�����ͱ��� ������α׷���","4.5 4.5");
		student[13] = new Student("�л�13","student13@gmail.com","010-0000-0013","��������а�","100","20160613","��ü�������α׷��� ���������","4.5 4.5");
		student[14] = new Student("�л�14","student14@gmail.com","010-0000-0014","��������а�","100","20160614","�˰��� �ü��","4.5 4.5");
		student[15] = new Student("�л�15","student15@gmail.com","010-0000-0015","��������а�","100","20160615","��ǻ�ͱ��� ��ǻ�ͳ�Ʈ��ũ","4.5 4.5");
		student[16] = new Student("�л�16","student16@gmail.com","010-0000-0016","��������а�","100","20160616","���ͳ�����׽ǽ� ����Ʈ�������","4.5 4.5");
		student[17] = new Student("�л�17","student17@gmail.com","010-0000-0017","��������а�","100","20160617","�����ͺ��̽� �����α׷���","4.5 4.5");
		student[18] = new Student("�л�18","student18@gmail.com","010-0000-0018","��������а�","100","20160618","ĸ���ϵ����� �ý������α׷���","4.5 4.5");
		student[19] = new Student("�л�19","student19@gmail.com","010-0000-0019","��������а�","100","20160619","����ũ�����μ����׽��� ��������α׷���","4.5 4.5");
		student[20] = new Student("�л�20","student20@gmail.com","010-0000-0020","�����а�","100","20160620","��ǻ�ͱ������翬���������� ���α׷��־���","4.5 4.5");
		student[21] = new Student("�л�21","student21@gmail.com","010-0000-0021","�����а�","100","20160621","��Ʈ��ũ���α׷��� �Ӻ����ý��۹׽ǽ�","4.5 4.5");
		student[22] = new Student("�л�22","student22@gmail.com","010-0000-0022","�����а�","100","20160622","��ǻ�ͽű�� ��ǻ�ͱ������׳��","4.5 4.5");
		student[23] = new Student("�л�23","student23@gmail.com","010-0000-0023","�����а�","100","20160623","������Ʈ���� ���������������α׷���","4.5 4.5");
		student[24] = new Student("�л�24","student24@gmail.com","010-0000-0024","�����а�","100","20160624","�����ͱ��� ������α׷���","4.5 4.5");
		student[25] = new Student("�л�25","student25@gmail.com","010-0000-0025","�����а�","100","20160625","��ü�������α׷��� ���������","4.5 4.5");
		student[26] = new Student("�л�26","student26@gmail.com","010-0000-0026","�����а�","100","20160626","�˰��� �ü��","4.5 4.5");
		student[27] = new Student("�л�27","student27@gmail.com","010-0000-0027","�����а�","100","20160627","��ǻ�ͱ��� ��ǻ�ͳ�Ʈ��ũ","4.5 4.5");
		student[28] = new Student("�л�28","student28@gmail.com","010-0000-0028","�����а�","100","20160628","���ͳ�����׽ǽ� ����Ʈ�������","4.5 4.5");
		student[29] = new Student("�л�29","student29@gmail.com","010-0000-0029","�����а�","100","20160629","�����ͺ��̽� �����α׷���","4.5 4.5");
		student[30] = new Student("�л�30","student30@gmail.com","010-0000-0030","�������а�","100","20160630","ĸ���ϵ����� �ý������α׷���","4.5 4.5");
		student[31] = new Student("�л�31","student31@gmail.com","010-0000-0031","�������а�","100","20160631","����ũ�����μ����׽��� ��������α׷���","4.5 4.5");
		student[32] = new Student("�л�32","student32@gmail.com","010-0000-0032","�������а�","100","20160632","��ǻ�ͱ������翬���������� ���α׷��־���","4.5 4.5");
		student[33] = new Student("�л�33","student33@gmail.com","010-0000-0033","�������а�","100","20160633","��Ʈ��ũ���α׷��� �Ӻ����ý��۹׽ǽ�","4.5 4.5");
		student[34] = new Student("�л�34","student34@gmail.com","010-0000-0034","�������а�","100","20160634","��ǻ�ͽű�� ��ǻ�ͱ������׳��","4.5 4.5");
		student[35] = new Student("�л�35","student35@gmail.com","010-0000-0035","�������а�","100","20160635","������Ʈ���� ���������������α׷���","4.5 4.5");
		student[36] = new Student("�л�36","student36@gmail.com","010-0000-0036","�������а�","100","20160636","�����ͱ��� ������α׷���","4.5 4.5");
		student[37] = new Student("�л�37","student37@gmail.com","010-0000-0037","�������а�","100","20160637","��ü�������α׷��� ���������","4.5 4.5");
		student[38] = new Student("�л�38","student38@gmail.com","010-0000-0038","�������а�","100","20160638","�˰��� �ü��","4.5 4.5");
		student[39] = new Student("�л�39","student39@gmail.com","010-0000-0039","�������а�","100","20160639","��ǻ�ͱ��� ��ǻ�ͳ�Ʈ��ũ","4.5 4.5");
	}
	
	{
		professor[0] = new Professor("����","professor@gmail.com","010-0000-0001","��ǻ�Ͱ��а�","200","042-0000-0001","�����ͱ��� ������α׷���","�а���","2017��1��1��");
		professor[1] = new Professor("����1","professor1@gmail.com","010-0000-0002","��ǻ�Ͱ��а�","200","042-0000-0002","��ü�������α׷��� ���������","������","2017��1��1��");
		professor[2] = new Professor("����2","professor2@gmail.com","010-0000-0003","��ǻ�Ͱ��а�","200","042-0000-0003","�˰��� �ü��","�α���","2017��1��1��");
		professor[3] = new Professor("����3","professor3@gmail.com","010-0000-0004","��������а�","200","042-0000-0004","��ǻ�ͱ��� ��ǻ�ͳ�Ʈ��ũ","�а���","2017��1��1��");
		professor[4] = new Professor("����4","professor4@gmail.com","010-0000-0005","��������а�","200","042-0000-0005","���ͳ�����׽ǽ� ����Ʈ�������","������","2017��1��1��");
		professor[5] = new Professor("����5","professor5@gmail.com","010-0000-0006","��������а�","200","042-0000-0006","�����ͺ��̽� �����α׷���","�α���","2017��1��1��");
		professor[6] = new Professor("����6","professor6@gmail.com","010-0000-0007","�����а�","200","042-0000-0007","ĸ���ϵ����� �ý������α׷���","�а���","2017��1��1��");
		professor[7] = new Professor("����7","professor7@gmail.com","010-0000-0008","�����а�","200","042-0000-0008","����ũ�����μ����׽��� ��������α׷���","������","2017��1��1��");
		professor[8] = new Professor("����8","professor8@gmail.com","010-0000-0009","�����а�","200","042-0000-0009","��ǻ�ͱ������翬���������� ���α׷��־���","�α���","2017��1��1��");
		professor[9] = new Professor("����9","professor9@gmail.com","010-0000-0010","�������а�","200","042-0000-0010","��Ʈ��ũ���α׷��� �Ӻ����ý��۹׽ǽ�","�а���","2017��1��1��");
		professor[10] = new Professor("����10","professor10@gmail.com","010-0000-0011","�������а�","200","042-0000-0011","��ǻ�ͽű�� ��ǻ�ͱ������׳��","������","2017��1��1��");
		professor[11] = new Professor("����11","professor11@gmail.com","010-0000-0012","�������а�","200","042-0000-0012","������Ʈ���� ���������������α׷���","�α���","2017��1��1��");	
	}
	
	{
		subject[0] = new Subject("�����ͱ���",4,"��ǻ�Ͱ��а�","����");
		subject[1] = new Subject("������α׷���",4,"��ǻ�Ͱ��а�","����");
		subject[2] = new Subject("��ü�������α׷���",4,"��ǻ�Ͱ��а�","����1");
		subject[3] = new Subject("���������",4,"��ǻ�Ͱ��а�","����1");
		subject[4] = new Subject("�˰���",4,"��ǻ�Ͱ��а�","����2");
		subject[5] = new Subject("�ü��",4,"��ǻ�Ͱ��а�","����2");
		subject[6] = new Subject("��ǻ�ͱ���",4,"��������а�","����3");
		subject[7] = new Subject("��ǻ�ͳ�Ʈ��ũ",4,"��������а�","����3");
		subject[8] = new Subject("���ͳ�����׽ǽ�",3,"��������а�","����4");
		subject[9] = new Subject("����Ʈ�������",3,"��������а�","����4");
		subject[10] = new Subject("�����ͺ��̽�",3,"��������а�","����5");
		subject[11] = new Subject("�����α׷���",3,"��������а�","����5");
		subject[12] = new Subject("ĸ���ϵ�����",3,"�����а�","����6");
		subject[13] = new Subject("�ý������α׷���",3,"�����а�","����6");
		subject[14] = new Subject("����ũ�����μ����׽���",3,"�����а�","����7");
		subject[15] = new Subject("��������α׷���",3,"�����а�","����7");
		subject[16] = new Subject("��ǻ�ͱ������翬������������",3,"�����а�","����8");
		subject[17] = new Subject("���α׷��־���",3,"�����а�","����8");
		subject[18] = new Subject("��Ʈ��ũ���α׷���",3,"�������а�","����9");
		subject[19] = new Subject("�Ӻ����ý��۹׽ǽ�",3,"�������а�","����9");
		subject[20] = new Subject("��ǻ�ͽű��",3,"�������а�","����10");
		subject[21] = new Subject("��ǻ�ͱ������׳��",3,"�������а�","����10");
		subject[22] = new Subject("������Ʈ����",3,"�������а�","����11");
		subject[23] = new Subject("���������������α׷���",3,"�������а�","����11");
	}
	{
		employee[0] =new Employee("����1","employee1@gmail.com","010-0000-0001","��ǻ�Ͱ��а�","150","042-0000-0001","�⹫","2017��1��1��");
		employee[1] =new Employee("����2","employee2@gmail.com","010-0000-0002","��ǻ�Ͱ��а�","150","042-0000-0002","������","2017��1��1��");
		employee[2] =new Employee("����3","employee3@gmail.com","010-0000-0003","��ǻ�Ͱ��а�","150","042-0000-0003","������","2017��1��1��");
		employee[3] =new Employee("����4","employee4@gmail.com","010-0000-0004","��������а�","150","042-0000-0004","�⹫","2017��1��1��");
		employee[4] =new Employee("����5","employee5@gmail.com","010-0000-0005","��������а�","150","042-0000-0005","������","2017��1��1��");
		employee[5] =new Employee("����6","employee6@gmail.com","010-0000-0006","��������а�","150","042-0000-0006","����","2017��1��1��");
		employee[6] =new Employee("����7","employee7@gmail.com","010-0000-0007","�����а�","150","042-0000-0007","����","2017��1��1��");
		employee[7] =new Employee("����8","employee8@gmail.com","010-0000-0008","�����а�","150","042-0000-0008","����","2017��1��1��");
		employee[8] =new Employee("����9","employee9@gmail.com","010-0000-0009","�����а�","150","042-0000-0009","�⹫","2017��1��1��");
		employee[9] =new Employee("����10","employee10@gmail.com","010-0000-0010","�������а�","150","042-0000-0010","������","2017��1��1��");
		employee[10] =new Employee("����11","employee11@gmail.com","010-0000-0011","�������а�","150","042-0000-0011","����","2017��1��1��");
		employee[11] =new Employee("����12","employee12@gmail.com","010-0000-0012","�������а�","150","042-0000-0012","�⹫","2017��1��1��");
		
	}
	{
		major[0] =  new Major("��ǻ�Ͱ��а�",10,"����","042-000-0020");
		major[1] =  new Major("������Ű��а�",10,"����3","042-000-0021");
		major[2] =  new Major("�����а�",10,"����6","042-000-0022");
		major[3] =  new Major("�������а�",10,"����9","042-000-0023");
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
	
	
	
//��ü���� �Ϸ�
	//���θ޴�
	public static void main(String[] args){
		boolean i =true;
		int num;
		main DB = new main();
		while(i){
			System.out.println("1.��������");
			System.out.println("2.��������");
			System.out.println("3.�л�����");
			System.out.println("4.�������");
			System.out.println("5.�а�����");
			System.out.println("6.����");
			System.out.println("�����Ͻ� ���� ����ּ���.:");
			num = input.nextInt(); input.nextLine();
			switch(num){
				case 1:
					System.out.println("====�������� �׸�====");
					DB.mainsprofessormeu();
					break;
				case 2:
					System.out.println("====�������� �׸�====");
					DB.mainemployeemenu();
					break;
				case 3:
					System.out.println("====�л����� �׸�====");
					DB.mainstudentmenu();
					break;
				case 4:
					System.out.println("====������� �׸�====");
					DB.subjectmeu();
					break;
				case 5:
					System.out.println("====�а����� �׸�====");
					DB.majormenu();
					break;
				case 6:
					i=false;
					break;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
//==========================================================�л������׸�============================================================================
	//�л����� �ֻ��� �޴�
	public void mainstudentmenu(){
		int num = 0;
		System.out.println("1.��ü�л����");
		System.out.println("2.�л��߰�");
		System.out.println("3.�л�����");
		System.out.println("4.�л��˻�");
		System.out.println("�����Ͻ� ���� ����ּ���.(�ܼ̿��ý� �����޴�):");
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

	// ��ü�л� ��¸޴�
	public void printallstu() {
		System.out.println("��ü�л��� ����մϴ�.");
		for (int i = 0; i < curstunum; i++) {
			System.out.println((i+1)+".�̸�:" + student[i].name + "�̸���:" + student[i].email + "��ȭ��ȣ:" + student[i].phonenum
				+ "�Ҽ��а�:" + student[i].major + "���б�:" + student[i].money + "�й�:" + student[i].student_num + "������:"
				+ student[i].student_subject + "��������:" + student[i].student_subgrade);
			}
			System.out.println("��ü�л� ����� �Ϸ��Ͽ����ϴ�.");
	}
	// �л��߰� �޴�
	public void addstudent(){
		System.out.println("========�л��߰� �޴�=========");
		System.out.println("�̸�:");
		student[curstunum].name=input.nextLine();
		System.out.println("�̸���:");
		student[curstunum].email=input.nextLine();
		System.out.println("��ȭ��ȣ:");
		student[curstunum].phonenum=input.nextLine();
		System.out.println("�Ҽ��а�:");
		student[curstunum].major=input.nextLine();
		recheckmajor(curstunum);
		System.out.println("���б�:");
		student[curstunum].money=input.nextLine();
		System.out.println("�й�:");
		student[curstunum].student_num=input.nextLine();
		student[curstunum].student_subject="";
		student[curstunum].student_subgrade="";
		System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
		curstunum++;
	}
	// �л����� �޴�
	public void delstudent(){
		int i=0;
		String arg1,arg2;
		System.out.println("========�л����� �޴�=========");
		printallstu();
		System.out.println("���° �л��� �����Ͻðٽ��ϱ�?:");
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
		System.out.println("������ �Ϸ��޽��ϴ�.");
	}
	// �л��˻����
	public void searchstumeau(){
		int i;
		String arg;
		System.out.println("========�л��˻� �޴�=========");
		System.out.println("ã��Ϳ� �л��� ���Ű���带 �����Ͻðٽ��ϱ�?:");
		System.out.println("1.�̸�");
		System.out.println("2.�й�");
		System.out.println("3.�̸���");
		System.out.println("4.��ȭ��ȣ");
		i = input.nextInt(); input.nextLine();
		System.out.println("�˻�� �Է��ϼ���.:");
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
	//�л�����
	public void changestudent(int i){
		int num;
		System.out.println("========�л����� �޴�=========");
		System.out.println(".�̸�:" + student[i].name + ",�̸���:" + student[i].email + ",��ȭ��ȣ:" + student[i].phonenum
				+ ",�Ҽ��а�:" + student[i].major + ",���б�:" + student[i].money + ",�й�:" + student[i].student_num + ",������:"
				+ student[i].student_subject + ",��������:" + student[i].student_subgrade);
		System.out.println("1.�̸�");
		System.out.println("2.�̸���");
		System.out.println("3.��ȭ��ȣ");
		System.out.println("4.�Ҽ��а�");
		System.out.println("5.���б�");
		System.out.println("6.�й�");
		System.out.println("7.��������");
		System.out.println("8.��������");
		System.out.println("�� �л��� ����׸��� �����Ͻðڽ��ϱ�?(0�Է½� �����޴�):");
		num = input.nextInt(); input.nextLine();
		if(num==0){
			searchstumeau();
		}
		if(num==1){
			System.out.println("========�л��̸����� �޴�=========");
			System.out.println("������ ����:");
			student[i].name = input.nextLine();
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==2){
			System.out.println("========�л��̸��ϼ��� �޴�=========");
			System.out.println("������ ����:");
			student[i].email = input.nextLine();
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==3){
			System.out.println("========�л���ȭ��ȣ���� �޴�=========");
			System.out.println("������ ����:");
			student[i].phonenum = input.nextLine();
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==4){
			String arg;
			System.out.println("========�л��а����� �޴�=========");
			arg = student[i].major;
			System.out.println("������ ����:");
			student[i].major = input.nextLine();
			recheckmajor2(arg,i);
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==5){
			System.out.println("========�л����бݼ��� �޴�=========");
			System.out.println("������ ����:");
			student[i].money = input.nextLine();
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==6){
			System.out.println("========�л��й����� �޴�=========");
			System.out.println("������ ����:");
			student[i].student_num = input.nextLine();
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==7){
			System.out.println("========�л������������ �޴�=========");
			changestusubject(i);
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==8){
			System.out.println("========�л��������� �޴�=========");
			changegrade(i);
			System.out.println("�����Ǿ����ϴ�.");
		}
	}
	//�а���������(�л��߰��� ������)
	public void recheckmajor(int i/*�л��� ����*/){
			for(int num2=0;num2<curmajornum;num2++){
				if(major[num2].name.equals(student[i].major)){
					major[num2].stunum = major[num2].stunum+1;
				}
			}	
	}
	//�а���������(�л�����������)
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
	//������������(�л�����������)
	public void recheckmajor3(String arg){
		for(int num=0;num<curmajornum;num++){
			if(major[num].name.equals(arg)){
					major[num].stunum = major[num].stunum-1;
			}
		}
	}
	//������������(�л�����������)
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
	//������������(�л�����������)
	public void changestusubject(int i){
		String str[] = student[i].student_subject.split(" ");
		int j,num,selnum;
		int num1 = str.length;
		for(j=0;j<num1;j++){
			System.out.println((j+1)+".�����̸�:"+str[j]);
		}
		System.out.println("���° ������ �����Ͻðٽ��ϱ�?");
		num = input.nextInt()-1; input.nextLine();
		for (j = 0; j < cursubject; j++) {
			System.out.println((j+1)+".�����̸�:" + subject[j].subname);
		}
		System.out.println("���° �������� �����Ͻðٽ��ϱ�?");
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
	//����������
	public void changegrade(int i){
		String str[] = student[i].student_subject.split(" ");
		String str2[] = student[i].student_subgrade.split(" ");
		int j,num;
		int num1 = str.length;
		int num2 = str2.length;
		for(j=0;j<num1;j++){
			System.out.println((j+1)+".�����̸�:"+str[j]);
		}
		System.out.println("���° ������ ������ �����Ͻðٽ��ϱ�?");
		num = input.nextInt()-1; input.nextLine();
		System.out.println("������ �����Ͻðڽ��ϱ�?(4.5,3.5,2.5):");
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
//==========================================================���������׸�============================================================================	
	//�������� �ֻ��� �޴�
	public void mainsprofessormeu(){
		int num = 0;
		System.out.println("1.��ü�������");
		System.out.println("2.�����߰�");
		System.out.println("3.��������");
		System.out.println("4.�����˻�");
		System.out.println("�����Ͻ� ���� ����ּ���.(�ܼ̿��ý� �����޴�):");
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
	//��ü�������
	public void printallpro(){
		System.out.println("��ü������ ����մϴ�.");
		for (int i = 0; i < curpronum; i++) {
			System.out.println((i+1)+".�̸�:" + professor[i].name + ",�̸���:" + professor[i].email + ",��ȭ��ȣ:" + professor[i].phonenum
				+ ",�Ҽ��а�:" + professor[i].major + ",����:" + professor[i].money + ",���:" + professor[i].profes_subphone+ ",���ǰ���:"
				+ professor[i].profes_subject+ ",����:" + professor[i].profes_rank+",�Ի���:"+ professor[i].profes_day);
			}
			System.out.println("��ü���� ����� �Ϸ��Ͽ����ϴ�.");
	}
	//�����߰��޴�
	public void addprofessor(){
		System.out.println("========�����߰� �޴�=========");
		System.out.println("�̸�:");
		professor[curpronum].name=input.nextLine();
		System.out.println("�̸���:");
		professor[curpronum].email=input.nextLine();
		System.out.println("��ȭ��ȣ:");
		professor[curpronum].phonenum=input.nextLine();
		System.out.println("�Ҽ��а�:");
		professor[curpronum].major=input.nextLine();
		System.out.println("����:");
		professor[curpronum].money=input.nextLine();
		System.out.println("���:");
		professor[curpronum].profes_subphone=input.nextLine();
		professor[curpronum].profes_subject="";
		System.out.println("����:");
		professor[curpronum].profes_rank=input.nextLine();
		System.out.println("�Ի���:");
		professor[curpronum].profes_day=input.nextLine();
		System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
		curpronum++;
	}
	// �������� �޴�//������ ����������� �а����� �����Ͻÿ�.
	public void delprofessor(){
		int i;
		String arg,arg1,arg2,arg3;
		System.out.println("========�������� �޴�=========");
		printallpro();
		System.out.println("���° ������ �����Ͻðٽ��ϱ�?:");
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
		System.out.println("������ �Ϸ��޽��ϴ�.");
	}
	//�����˻����
	public void searchpromeau(){
		int i;
		String arg;
		System.out.println("========�����˻� �޴�=========");
		System.out.println("ã��Ϳ� ������ ���Ű���带 �����Ͻðٽ��ϱ�?:");
		System.out.println("1.�̸�");
		System.out.println("2.�̸���");
		System.out.println("3.��ȭ��ȣ");
		i = input.nextInt(); input.nextLine();
		System.out.println("�˻�� �Է��ϼ���.:");
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
	//��������
	public void changeprofessor(int i){
		int num;
		System.out.println("ã�� ����:�̸�:" + professor[i].name + ",�̸���:" + professor[i].email + ",��ȭ��ȣ:" + professor[i].phonenum
				+ ",�Ҽ��а�:" + professor[i].major + ",����:" + professor[i].money + ",���:" + professor[i].profes_subphone+ ",���ǰ���:"
				+ professor[i].profes_subject+ ",����:" + professor[i].profes_rank+",�Ի���:"+ professor[i].profes_day);
		System.out.println("1.�̸�");
		System.out.println("2.�̸���");
		System.out.println("3.��ȭ��ȣ");
		System.out.println("4.�Ҽ��а�");
		System.out.println("5.����");
		System.out.println("6.���ǰ���");
		System.out.println("7.����");
		System.out.println("8.�Ի���");
		System.out.println("�� ������ ����׸��� �����Ͻðڽ��ϱ�?(0�Է½� �����޴�):");
		num = input.nextInt(); input.nextLine();
		if(num==0){
			searchpromeau();
		}
		if(num==1){
			System.out.println("========�����̸����� �޴�=========");
			System.out.println("������ ����:");
			professor[i].name = input.nextLine();
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==2){
			System.out.println("========�����̸��ϼ��� �޴�=========");
			System.out.println("������ ����:");
			professor[i].email = input.nextLine();
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==3){
			System.out.println("========������ȭ��ȣ���� �޴�=========");
			System.out.println("������ ����:");
			professor[i].phonenum = input.nextLine();
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==4){//�а����Ͻ� �ٸ� ������ �а�������
			System.out.println("========�����а����� �޴�=========");
			repromajor(professor[i].major,professor[i].profes_rank);
			System.out.println("������ ����:");
			professor[i].major = input.nextLine();
			professor[i].profes_rank = "����";
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==5){
			System.out.println("========�������޼��� �޴�=========");
			System.out.println("������ ����:");
			professor[i].money = input.nextLine();
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==6){
			System.out.println("========���������߰� �޴�=========");
			addprofessorsub(i);
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==7){
			System.out.println("========������å���� �޴�=========");
			repromajor(professor[i].major,professor[i].profes_rank);
			System.out.println("������ ����:");
			professor[i].profes_rank = input.nextLine();
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==8){
			System.out.println("========�����Ի��ϼ��� �޴�=========");
			System.out.println("������ ����:");
			professor[i].profes_day = input.nextLine();
			System.out.println("�����Ǿ����ϴ�.");
		}
	}
	//���������� �а��庯��
	public void repromajor(String arg,String arg2){
		int select;
		if(arg2=="�а���"){
			System.out.println("�̱����� �а����Դϴ�.");
			for(int i=0;i<curpronum;i++){
				if(professor[i].major==arg){
					System.out.println((i+1)+"."+professor[i].name);
				}
			}
			System.out.println("��� ������ �а������� ����ðڽ��ϱ�?");
			select = input.nextInt()-1; input.nextLine();
			professor[select].profes_rank="�а���";
			for(int j=0;j<curmajornum;j++){
				if(major[j].name==arg){
					major[j].profes=professor[select].name;
				}
			}
		}
	}
	//���� ������ ������ ���� ��ȭ
	public void reprosubject(String arg,String arg1){
		int num;
		for(int i=0;i<curpronum;i++){
			System.out.println((i+1)+".����:�̸�:"+professor[i].name);
		}
		System.out.println("��� �������� ������ ���������� �������ֽðٽ��ϱ�?");
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
	//���� �������߰�
	public void addprofessorsub(int num){
		int j;
		System.out.println("�������� ����մϴ�.");
		for(int i=0;i<cursubject;i++){
			System.out.println((i+1)+".�����̸�:" + subject[i].subname + ",�л���:" + subject[i].substunum + ",�Ҽ��а�:" + subject[i].submajor
					+ ",��米��:" + subject[i].subpro);
		}
		System.out.println("����������� �� ����Ͻðٽ��ϱ�?:");
		j = input.nextInt()-1;  input.nextLine();
		if(professor[num].profes_subject.equals("")){
			professor[num].profes_subject += subject[j].subname;
		}
		else{
			professor[num].profes_subject += " "+ subject[j].subname;
		}
		subject[j].subpro += " " + professor[num].name;
	}
//==========================================================����,���� �����׸�============================================================================		
	//�������� �ֻ��� �޴�
	public void mainemployeemenu(){
		int num = 0;
		System.out.println("1.��ü�������");
		System.out.println("2.�����߰�");
		System.out.println("3.��������");
		System.out.println("4.�����˻�");
		System.out.println("�����Ͻ� ���� ����ּ���.(�ܼ̿��ý� �����޴�):");
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
	//��ü�������
	public void printallemp(){
		System.out.println("��ü������ ����մϴ�.");
		for (int i = 0; i < curempnum; i++) {
			System.out.println((i+1)+".�̸�:" + employee[i].name + "�̸���:" + employee[i].email + "��ȭ��ȣ:" + professor[i].phonenum
				+ "�ҼӺμ�:" + employee[i].major + "����:" + employee[i].money + "���:" + professor[i].profes_subphone+
				"����:" + employee[i].empoly_rank+"�Ի���:"+ employee[i].empoly_day);
			}
			System.out.println("��ü���� ����� �Ϸ��Ͽ����ϴ�.");
	}
	//�����߰��޴�
	public void addemployee(){
		System.out.println("========�����߰� �޴�=========");
		System.out.println("�̸�:");
		employee[curempnum].name = input.nextLine();
		System.out.println("�̸���:");
		employee[curempnum].email = input.nextLine();
		System.out.println("��ȭ��ȣ:");
		employee[curempnum].phonenum = input.nextLine();
		System.out.println("�ҼӺμ�:");
		employee[curempnum].major = input.nextLine();
		System.out.println("����:");
		employee[curempnum].money = input.nextLine();
		System.out.println("���:");
		employee[curempnum].empoly_subphone = input.nextLine();
		System.out.println("����:");
		employee[curempnum].empoly_rank = input.nextLine();
		System.out.println("�Ի���:");
		employee[curempnum].empoly_day = input.nextLine();
		System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
		curempnum++;
	}	
	//�������� �޴�
	public void delemployee(){
		int i;
		System.out.println("========�������� �޴�=========");
		printallemp();
		System.out.println("���° ������ �����Ͻðٽ��ϱ�?:");
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
		System.out.println("������ �Ϸ��޽��ϴ�.");
	}
	//�����˻����
	public void searchempmeau(){
		int i;
		String arg;
		System.out.println("========�����˻� �޴�=========");
		System.out.println("ã��Ϳ� ������ ���Ű���带 �����Ͻðٽ��ϱ�?:");
		System.out.println("1.�̸�");
		System.out.println("2.�̸���");
		System.out.println("3.��ȭ��ȣ");
		i = input.nextInt(); input.nextLine();
		System.out.println("�˻�� �Է��ϼ���.:");
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
	//��������
	public void changeemployee(int i){
		int num;
		System.out.println("ã�� ����:�̸�:" + employee[i].name + "�̸���:" + employee[i].email + "��ȭ��ȣ:" + professor[i].phonenum
				+ "�ҼӺμ�:" + employee[i].major + "����:" + employee[i].money + "���:" + professor[i].profes_subphone+
				"����:" + employee[i].empoly_rank+"�Ի���:"+ employee[i].empoly_day);
		System.out.println("1.�̸�");
		System.out.println("2.�̸���");
		System.out.println("3.��ȭ��ȣ");
		System.out.println("4.�Ҽ��а�");
		System.out.println("5.����");
		System.out.println("6.����");
		System.out.println("7.�Ի���");
		System.out.println("�� ������ ����׸��� �����Ͻðڽ��ϱ�?(0�Է½� �����޴�):");
		num = input.nextInt(); input.nextLine();
		if(num==0){
			searchempmeau();
		}
		if(num==1){
			System.out.println("========�����̸����� �޴�=========");
			System.out.println("������ ����:");
			employee[i].name = input.nextLine();
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==2){
			System.out.println("========�����̸��ϼ��� �޴�=========");
			System.out.println("������ ����:");
			employee[i].email = input.nextLine();
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==3){
			System.out.println("========������ȭ��ȣ���� �޴�=========");
			System.out.println("������ ����:");
			employee[i].phonenum = input.nextLine();
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==4){
			System.out.println("========�����а����� �޴�=========");
			System.out.println("������ ����:");
			changeempmajor(i);
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==5){
			System.out.println("========�������޼��� �޴�=========");
			System.out.println("������ ����:");
			employee[i].money = input.nextLine();
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==6){
			System.out.println("========�������޼��� �޴�=========");
			System.out.println("������ ����:");
			employee[i].empoly_rank = input.nextLine();
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==7){
			System.out.println("========�����Ի��ϼ��� �޴�=========");
			System.out.println("������ ����:");
			employee[i].empoly_day = input.nextLine();
			System.out.println("�����Ǿ����ϴ�.");
		}
	}
	//�����а�����
	public void changeempmajor(int i){
		for(int j=0;j<curmajornum;j++){
			if(major[j].name.equals(employee[i].major)){
			}
			else{
				System.out.println((j+1)+major[j].name);
			}
		}
		int num;
		System.out.println("����а��� ���ðٽ��ϱ�?");
		num = input.nextInt()-1; input.nextLine();
		employee[i].major = major[num].name;
	}
//==========================================================���� �����׸�============================================================================
	//������� �ֻ��� �޴�
	public void subjectmeu(){
		int num = 0;
		System.out.println("1.��ü�������");
		System.out.println("2.�����߰�");
		System.out.println("3.�������");
		System.out.println("4.����˻�");
		System.out.println("�����Ͻ� ���� ����ּ���.(�ܼ̿��ý� �����޴�):");
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
	//��ü�������
	public void printallsub(){
		System.out.println("��ü������ ����մϴ�.");
		for (int i = 0; i < cursubject; i++) {
			System.out.println((i+1)+".�����̸�:" + subject[i].subname + ",�л���:" + subject[i].substunum + ",�Ҽ��а�:" + subject[i].submajor
				+ ",��米��:" + subject[i].subpro);
			}
			System.out.println("��ü���� ����� �Ϸ��Ͽ����ϴ�.");
	}
	//�����߰��޴�
	public void addsubject(){
		System.out.println("========�����߰� �޴�=========");
		System.out.println("�����̸�:");
		subject[cursubject].subname=input.nextLine();
		subject[cursubject].substunum = 0;
		System.out.println("�Ҽ��а�:");
		subject[cursubject].submajor=input.nextLine();
		System.out.println("��米��:");
		subject[cursubject].subpro="";
		cursubject++;
	}
	//������� �޴�//������ �л��� ���� ��� ���� ��ȯ.
	public void delsubject(){
		int i;
		String arg;
		System.out.println("========������� �޴�=========");
		printallsub();
		System.out.println("���° ������ �����Ͻðٽ��ϱ�?:");
		i= input.nextInt()-1;
		arg = subject[i].subname;
		subject[i].subname = subject[cursubject-1].subname;
		subject[i].substunum = subject[cursubject-1].substunum;
		subject[i].submajor = subject[cursubject-1].submajor;
		subject[i].subpro = subject[cursubject-1].subpro;
		cursubject--;
		delstusubject(arg);
		delprosubject(arg);
		System.out.println("������ �Ϸ��޽��ϴ�.");
	}
	//����˻����
	public void searchsubject(){
		String arg;
		System.out.println("========����˻� �޴�=========");
		System.out.println("�����̸��� �Է��Ͻʽÿ�.:");
		arg =input.nextLine();
		for(int num=0;num<cursubject;num++){					
			if((subject[num].subname).equals(arg)){
				changesubject(num);
			}
		}
	}
	//�������
	public void changesubject(int i){
		int num;
		String arg;
		arg = subject[i].subname;
		System.out.println("ã�� ����: �����̸�:" + subject[i].subname + ",�л���:" + subject[i].substunum + ",�Ҽ��а�:" + subject[i].submajor
				+ ",��米��:" + subject[i].subpro);		
		System.out.println("1.�����̸�����");
		System.out.println("2.������ Ȯ��");
		System.out.println("3.������ �߰�");
		System.out.println("4.������ ����");
		System.out.println("�����Ͻ� ���� ����ּ���.(0�Է½� �����޴�)");
		num = input.nextInt(); input.nextLine();
		if(num==0){
			searchsubject();
		}
		if(num==1){
			System.out.println("========������� �޴�=========");
			resubname(arg,i);
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==2){
			System.out.println("========���������Ȯ�� �޴�=========");
			printstu(arg);
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==3){
			System.out.println("========����������߰� �޴�=========");
			addsubstu(arg);
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==4){
			System.out.println("========������������� �޴�=========");
			delsubstu(arg);
			System.out.println("�����Ǿ����ϴ�.");
		}
		
	}
	//����������� �л��� ���������
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
	//����������� ������ ���������
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
	//������ �̸�����
	public void resubname(String arg,int i){
		System.out.println("������ �����̸�:");
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
	//�л����
	public void printstu(String arg){
		for(int i=0;i<curstunum;i++){
			String str[] = student[i].student_subject.split(" ");
			int num = str.length;
			for(int j=0;j<num;j++){
				if(str[j].equals(arg)){
					System.out.println((i+1)+".�̸�:" + student[i].name + "�̸���:" + student[i].email + "��ȭ��ȣ:" + student[i].phonenum
							+ "�Ҽ��а�:" + student[i].major + "���б�:" + student[i].money + "�й�:" + student[i].student_num + "������:"
							+ student[i].student_subject + "��������:" + student[i].student_subgrade);
				}
			}
		}
		System.out.println("�̰����� ��� �л����Դϴ�.");
	}
	//�л��߰�
	public void addsubstu(String arg){
		for(int i=0;i<curstunum;i++){
			System.out.println((i+1)+".�̸�:" + student[i].name + "�̸���:" + student[i].email + "��ȭ��ȣ:" + student[i].phonenum
					+ "�Ҽ��а�:" + student[i].major + "���б�:" + student[i].money + "�й�:" + student[i].student_num + "������:"
					+ student[i].student_subject + "��������:" + student[i].student_subgrade);
		}
		System.out.println("���° �л��� �߰��Ͻðٽ��ϱ�?:");
		int select = input.nextInt() - 1; input.nextLine();
		student[select].student_subject += " "+arg;
		student[select].student_subgrade += " 0";
	}
	//�л�����
	public void delsubstu(String arg){
		printstu(arg);
		System.out.println("���° �л��� �����Ͻðٽ��ϱ�?:");
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
//==========================================================�а� �����׸�============================================================================	
	//�а����� �ֻ��� �޴�
	public void majormenu(){
		int num = 0;
		System.out.println("1.��ü�а����");
		System.out.println("2.�а��߰�");
		System.out.println("3.�а�����");
		System.out.println("4.�а��˻�");
		System.out.println("�����Ͻ� ���� ����ּ���.(�ٸ����� �Է½� �����޴�):");
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
	//��ü�а����
	public void printallmajor(){
		System.out.println("��ü�а��� ����մϴ�.");
		for (int i = 0; i < curmajornum; i++) {
			System.out.println((i+1)+".�а��̸�:" + major[i].name + ",�л���:" +major[i].stunum + ",��米��:" + major[i].profes
				+ ",�а���ȣ:" + major[i].phone);
			}
			System.out.println("��ü�а� ����� �Ϸ��Ͽ����ϴ�.");
	}
	//�а��߰��޴� 
	public void addmajor(){
		System.out.println("========�а��߰� �޴�=========");
		System.out.println("�а��̸�:");
		major[curmajornum].name=input.nextLine();
		major[curmajornum].stunum = 0;
		major[curmajornum].profes="";
		System.out.println("�а���ȣ:");
		major[curmajornum].phone=input.nextLine();
		curmajornum++;
	}	
	//�а����� �޴�
	public void delmajor(){
		int i;
		String arg;
		int num;
		System.out.println("========�а����� �޴�=========");
		printallmajor();
		System.out.println("���° �а��� �����Ͻðٽ��ϱ�?:");
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
				System.out.println((j+1)+".�а��̸�:" + major[j].name);
			}
		}
		System.out.println("��� �а��� �����Ͻðٽ��ϱ�?");
		int num1;
		num1 = input.nextInt()-1; input.nextLine();
		changestumajor(arg,num,num1);
		changepromajor(arg,num1);
		System.out.println("������ �Ϸ��޽��ϴ�.");
	}	
	//�а��˻����
	public void searchmajor(){
		String arg;
		System.out.println("========�а��˻� �޴�=========");
		System.out.println("�а��̸��� �Է��Ͻʽÿ�.:");
		arg =input.nextLine();
		for(int num=0;num<curmajornum;num++){					
			if((major[num].name).equals(arg)){
				changemajor(num);
			}
		}
	}	
	//�а�����
	public void changemajor(int i){
		int num;
		String arg;
		arg = major[i].name;
		System.out.println("ã�� �а�: �а��̸�:" + major[i].name + ",�л���:" +major[i].stunum + ",��米��:" + major[i].profes
				+ ",�а���ȣ:" + major[i].phone);	
		System.out.println("1.�а��̸� ����");
		System.out.println("2.�а���米�� ����");
		System.out.println("3.�а���ȣ ����");
		System.out.println("�˻�� �Է��ϼ���.:(0�Է½� �����޴�)");
		num = input.nextInt(); input.nextLine();
		if(num==0){
			searchmajor();
		}
		if(num==1){
			System.out.println("========�а��̸����� �޴�=========");
			System.out.println("������ �а��̸�:");
			major[i].name = input.nextLine();
			changemajorname(arg,i);
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==2){
			System.out.println("========�а���米������ �޴�=========");
			changemainpro(arg,i);
			System.out.println("�����Ǿ����ϴ�.");
		}
		if(num==3){
				System.out.println("========�а���ȣ���� �޴�=========");
				major[i].phone = input.nextLine();
				System.out.println("�����Ǿ����ϴ�.");
		}
	}	
	//�а������� �л��а�����
	public void changestumajor(String arg,int i,int num){
		for(int j=0;j<curstunum;j++){
			if(student[j].major.equals(arg)){
				student[j].major = major[num].name;
			}
		}
		major[num].stunum += i;
	}
	//�а������� �����а�����
	public void changepromajor(String arg,int num){
		for(int j=0;j<curpronum;j++){
			if(professor[j].major.equals(arg)){
				professor[j].major = major[num].name;
				if(professor[j].major.equals("�а���")){
					professor[j].major="����";
				}
			}
		}
	}
	//�а������� �����а�����
	public void changeempmajor(String arg,int num){
		for(int j=0;j<curempnum;j++){
			if(employee[j].major.equals(arg)){
				employee[j].major = major[num].name;
			}
		}
	}
	//�а��̸������ �а��� �ִ� ������� ��� ����
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
	//�а��庯��
	public void changemainpro(String arg, int i){
		for(int j=0;j<curpronum;j++){
			if(professor[j].profes_rank.equals("�а���")){
				if(professor[j].major.equals(arg)){
					professor[j].profes_rank = "����";
				}
			}
			else{
				System.out.println((j+1)+"."+professor[j].name); 
			}
			
			}
		System.out.println("��������� �а������� ����ðڽ��ϱ�?"); 
		int num;
		num = input.nextInt()-1; input.nextLine();
		if(professor[num].major.equals(arg)){
			professor[num].profes_rank = "�а���";
			major[i].profes = professor[num].name;
		}
		else{
			professor[num].profes_rank = "�а���";
			major[i].profes = professor[num].name;
			professor[num].major = major[i].name;
		}
	}
}//class�ǳ�