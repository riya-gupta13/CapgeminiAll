package pixogram.sprint1;

import java.io.File;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Content {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ContentId;
	private String caption;
	private File file;
	private String filepath;

	public Content() {

	}

	public Content(String caption, File file, String filepath) {
		super();
		this.caption = caption;
		this.file = file;
		this.filepath = filepath;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	@Override
	public String toString() {
		return "Content [ContentId=" + ContentId + ", caption=" + caption + ", file=" + file + ", filepath=" + filepath
				+ "]";
	}

}
