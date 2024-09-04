package privates;

import java.time.LocalDate;

public class BuildMe {
    private String name;
    private LocalDate date;

    private BuildMe() {
    }

    public static Builder builder() {
        return new Builder();//Accessing a private field in a nested class (private members can be accessed within the top level class)
    }

    public static class Builder {
        private BuildMe template = new BuildMe();//Accessing a private field in a top level class (private members can be accessed within the top level class)

        private Builder() {
        }

        public Builder name(String name) {
            template.name = name;
            return this;
        }

        public Builder date(LocalDate date) {
            template.date = date;
            return this;
        }

        public BuildMe build() {
            BuildMe rv = template;
            template = null;
            return rv;
        }
    }

    @Override
    public String toString() {
        return "BuildMe{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
