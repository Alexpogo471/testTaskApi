package task1.pojo;

import java.util.List;

public class PageRoot {


    private int page;

    private int per_page;

    private int total;

    private int total_pages;

    private List<User> data;

    private Ad ad;

    public void setPage(int page){
        this.page = page;
    }
    public int getPage(){
        return this.page;
    }
    public void setPer_page(int per_page){
        this.per_page = per_page;
    }
    public int getPer_page(){
        return this.per_page;
    }
    public void setTotal(int total){
        this.total = total;
    }
    public int getTotal(){
        return this.total;
    }
    public void setTotal_pages(int total_pages){
        this.total_pages = total_pages;
    }
    public int getTotal_pages(){
        return this.total_pages;
    }
    public void setData(List<User> users){
        this.data = users;
    }
    public List<User> getUsers(){
        return this.data;
    }
    public void setAd(Ad ad){
        this.ad = ad;
    }
    public Ad getAd(){
        return this.ad;
    }

    @Override
    public String toString() {
        return "PageRoot{" +
                "page=" + page +
                ", per_page=" + per_page +
                ", total=" + total +
                ", total_pages=" + total_pages +
                ", users=" + data +
                ", ad=" + ad +
                '}';
    }
}
