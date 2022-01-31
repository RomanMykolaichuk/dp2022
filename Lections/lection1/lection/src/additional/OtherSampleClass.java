package additional;

import java.util.Objects;

public class OtherSampleClass {

	private String title;

	public OtherSampleClass(String title) {
		super();
		this.title = title;
	}

	@Override
	public String toString() {
		return "OtherSampleClass ["+this.title+"]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		OtherSampleClass other = (OtherSampleClass) obj;
		return Objects.equals(title, other.title);
	}




}
