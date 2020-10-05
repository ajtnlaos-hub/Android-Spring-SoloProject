package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component
public class GridExamConsole implements ExamConsole {

	@Autowired
	
	private Exam exam;
	
	public GridExamConsole() {}
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {

		System.out.println("total | avg");
		System.out.println(exam.total() + "  |  " + exam.avg());

	}
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
