package cn.darkjrong.fdfs.exception;

/**
 *  FastDFS 异常类
 *
 * @author Rong.Jia
 * @date 2021/07/25 09:58:21
 */
public class FdfsException extends RuntimeException {

    public FdfsException(String message) {
        super(message);
    }

    public FdfsException(String message, Throwable cause) {
        super(message, cause);
    }


}
