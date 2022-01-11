package utilities;

public enum MsgError {

    MSG_CODE_ERROR("Status no equals, expect \"%s\", actual \"%s\"");

    private String msg;

    MsgError(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
