package id.eightstudio.danboru.sqliterelation.Provider;

/**
 * Created by danboru on 4/27/17.
 */
public class Todo {

    int id;
    String note;
    int status;
    String created_at;

    public Todo() {
    }

    public Todo(int id, String note, int status, String created_at) {
        this.id = id;
        this.note = note;
        this.status = status;
        this.created_at = created_at;
    }

    public Todo(String note, int status, String created_at) {
        this.note = note;
        this.status = status;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }


}
