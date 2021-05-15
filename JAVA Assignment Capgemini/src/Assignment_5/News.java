package Assignment_5;

public class News {
	int newsID;
    String postedbyUser;
    String commentbyUser;
    String comment;
	public News(int newsID, String postedbyUser, String commentbyUser, String comment) {
		super();
		this.newsID = newsID;
		this.postedbyUser = postedbyUser;
		this.commentbyUser = commentbyUser;
		this.comment = comment;
	}
	public int getNewsID() {
		return newsID;
	}
	public void setNewsID(int newsID) {
		this.newsID = newsID;
	}
	public String getPostedbyUser() {
		return postedbyUser;
	}
	public void setPostedbyUser(String postedbyUser) {
		this.postedbyUser = postedbyUser;
	}
	public String getCommentbyUser() {
		return commentbyUser;
	}
	public void setCommentbyUser(String commentbyUser) {
		this.commentbyUser = commentbyUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
    

}
