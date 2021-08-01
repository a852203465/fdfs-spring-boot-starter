package cn.darkjrong.fdfs.exception;

/**
 * 异常枚举
 *
 * @author Rong.Jia
 * @date 2021/08/01 17:10:42
 */
public enum ExceptionEnum {

    // 文件不存在
    FILE_NOT_FOUND("文件不存在"),

    // 追加文件不存在
    THE_APPENDED_FILE_DOES_NOT_EXIST("追加文件不存在"),







    ;


    public String value;

    ExceptionEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
