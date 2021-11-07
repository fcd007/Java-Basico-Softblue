package Application;
import java.util.Date;

public class Calendario {

	private Long id;
	private Date dataDia;

	public Calendario(Long id, Date dataDia) {
		this.id = id;
		this.dataDia = dataDia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataDia() {
		return dataDia;
	}

	public void setDataDia(Date dataDia) {
		this.dataDia = dataDia;
	}

	@Override
	public String toString() {
		return "Calendario [id=" + id + ", dataDia=" + dataDia + "]";
	}

}
