package Corretor.src.Repositories;

import Corretor.src.Models.*;
import java.util.ArrayList;

public class BaseRepository <T extends BaseModel> {
    private ArrayList<T> repoData = new ArrayList<T>(200);
    private int currentID = 1;

    public void create(T data) {
        data.setId(currentID);
        repoData.add(data);

        currentID += 1;
    }

    public T update(T data, int index) {
        this.repoData.add(index, data);
        return data;
    }

    public T delete(int index) {
        T deletedData = this.repoData.get(index);
        this.repoData.remove(index);
        return deletedData;
    }

    public T getOneByIndex(int index) {
        return this.repoData.get(index);
    }

    public T getOneById(int id) {
        T resultData = null;

        for (int i = 0; i < this.repoData.size(); i++) {
            if (this.repoData.get(i).getId() == id) {
                resultData = this.repoData.get(i);
                break;
            }
        }

        return resultData;
    }

    public ArrayList<T> getRepoData() {
        return repoData;
    }
}
