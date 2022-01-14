package view;

import java.util.List;

public class View<E> {

    public String readAll(List<E> dtos) {
        StringBuilder sb = new StringBuilder();
        dtos.stream().forEach(v -> sb.append(";" + v.toString() + ";"));

        return sb.toString();
    }

}

