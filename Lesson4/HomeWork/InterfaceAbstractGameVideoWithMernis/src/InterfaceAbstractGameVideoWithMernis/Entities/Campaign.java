package InterfaceAbstractGameVideoWithMernis.Entities;

import java.time.LocalDate;

import InterfaceAbstractGameVideoWithMernis.Abstract.IEntity;

public class Campaign implements IEntity{
	
	private int id;
	private String title;
	private LocalDate startedAt;
	private LocalDate completedAt;
	private int discountRate;
	
	public Campaign() {
		
	}

	public Campaign(int id, String title, LocalDate startedAt, LocalDate completedAt, int discountRate) {
		super();
		this.id = id;
		this.title = title;
		this.startedAt = startedAt;
		this.completedAt = completedAt;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getStartedAt() {
		return startedAt;
	}

	public void setStartedAt(LocalDate startedAt) {
		this.startedAt = startedAt;
	}

	public LocalDate getCompletedAt() {
		return completedAt;
	}

	public void setCompletedAt(LocalDate completedAt) {
		this.completedAt = completedAt;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	

}
