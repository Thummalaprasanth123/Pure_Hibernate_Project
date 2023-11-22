package in.prasanth.entity;

public class Country {
	private String sno;
	private String cname;
	private String ccode;

	@Override
	public String toString() {
		return "Country [sno=" + sno + ", cname=" + cname + ", ccode=" + ccode + "]";
	}

	public String getSno() {
		return sno;
	}

	public String getCname() {
		return cname;
	}

	public String getCcode() {
		return ccode;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void setCcode(String ccode) {
		this.ccode = ccode;
	}
}
