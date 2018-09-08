package hongwei.quhw.zq.exception;

/**
 * Copyright (C) 2013-2018 Ant Financial Services Group
 *
 * @author hongwei.quhw
 * @version $Id: DalException.java, v 0.1 2018年9月8日 上午10:50:47 hongwei.quhw Exp $
 */
public class DalException extends RuntimeException {
    /**  */
    private static final long         serialVersionUID = 3152661907521159410L;
    private final DalErrorCodeEnum errorCode;

    public DalException(String message, Throwable cause, DalErrorCodeEnum errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public DalException(String message, DalErrorCodeEnum errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public DalException(Throwable cause, DalErrorCodeEnum errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }

    public DalErrorCodeEnum getErrorCode() {
        return errorCode;
    }

    public String toString() {
        String s = getClass().getName() + ": errorCode=" + errorCode.name();
        String message = getLocalizedMessage();
        return (message != null) ? (s + ": " + message) : s;
    }
}
