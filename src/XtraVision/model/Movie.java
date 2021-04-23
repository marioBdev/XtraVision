package XtraVision.model;

public class Movie {
    private int idMovie;
    private String title;
    private String subtitle;
    private String description;
    private String director;
    private String starringMovie;
    private String releasedMovie;
    private int rateStar;
    //status


    private String price;
    private boolean coupon = false;
    // check that out: Why String in the image?
    private String imgSrc;

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public static final String CURRENCY = ("€");


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMiniSubtitle() {
        return subtitle;
    }

    public void setMiniSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean getCoupon() {
        return coupon;
    }

    public void setCoupon(boolean cupon) {
        this.coupon = cupon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStarringMovie() {
        return starringMovie;
    }

    public void setStarringMovie(String starringMovie) {
        this.starringMovie = starringMovie;
    }

    public String getReleasedMovie() {
        return releasedMovie;
    }

    public void setReleasedMovie(String releasedMovie) {
        this.releasedMovie = releasedMovie;
    }

    public int getRateStar() {
        return rateStar;
    }

    public void setRateStar(int rateStar) {
        this.rateStar = rateStar;
    }
}
