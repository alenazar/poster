public class Manager {

    private String[] films;
    private int limit = 0;

    public Manager() {
        this.limit = 10;
    }

    public Manager(int limit) {
        this.limit = limit;
    }

    public void addFilms(String[] newFilms) {
        this.films = newFilms;
    }

    public String[] findAll() {
        if (films == null) {
            return new String[]{"Фильмов нет!"};
        }
        return films;
    }

    public String[] findLast() {
        if (films == null) {
            return new String[]{"Фильмов нет!"};
        }
        String[] result;
        if (limit > films.length) {
            result = new String[films.length];
        } else {
            result = new String[limit];
        }
        int count = 0;
        for (int i = films.length - 1; i >= 0; i--) {
            if (limit > count) {
                result[count] = films[i];
                count++;
            }

        }
        return result;
    }
}
