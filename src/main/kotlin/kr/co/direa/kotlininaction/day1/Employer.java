package kr.co.direa.kotlininaction.day1;

public class Employer {
    private final Long id;
    private final String name;
    private final Integer interest;
    private final String email;

    public Employer(Long id, String name, Integer interest, String email) {
        this.id = id;
        this.name = name;
        this.interest = interest;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getInterest() {
        return interest;
    }

    public String getEmail() {
        return email;
    }
}
