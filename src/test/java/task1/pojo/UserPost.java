package task1.pojo;

import java.util.Objects;

public class UserPost {
    private int id;

    private String name;

    private String job;

    public UserPost(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "UserPost{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPost userPost = (UserPost) o;
        return name.equals(userPost.name) &&
                job.equals(userPost.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, job);
    }
}
