package com.forte.qqrobot.beans.messages.msgget;

/**
 * 群文件上传事件
 * @author ForteScarlet <[163邮箱地址]ForteScarlet@163.com>
 * @date Created in 2019/4/18 11:22
 * @since JDK1.8
 **/
public interface GroupFileUpload extends EventGet {

    /** 群号 */
    String getGroup();

    /** 发信人QQ */
    String getQQ();

    /** 文件名 */
    String getFileName();

    /** 文件大小 Long类型，字节 */
    Long getFileSize();

    /** 获取文件Busid */
    String getFileBusid();



}
