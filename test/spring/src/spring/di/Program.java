package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
	
		/* 이 작업을 spring이 해줌 xml을 통해 지시받음
		 * Exam exam = new NewlecExam(); 
		 * ExamConsole console = new InlineExamConsole();
		 * // DI console.setExam(exam);
		 */
		//ExamConsole console = new GridExamConsole(exam);
		
		// IOC 컨테이너 사용
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml"); 
		
		//Exam exam = context.getBean(NewlecExam.class);
		// ExamConsole console = (ExamConsole) context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class);
		//console.print();
		
		// 컬렉션 DI도 가능
		/*
		 * List<Exam> exams = (List<Exam>)context.getBean("exams");
		 * 
		 * for(Exam e : exams) System.out.println(e.total());
		 */
		
		
		// 자바 config 사용
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
	}

}
