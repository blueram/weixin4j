package com.foxinmy.weixin4j.qy.chat;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 接收人
 * 
 * @className ChatReceiver
 * @author jy
 * @date 2015年8月1日
 * @since JDK 1.7
 * @see
 */
public class ChatReceiver implements Serializable {

	private static final long serialVersionUID = -3870813624685620828L;
	/**
	 * 成员id|会话id
	 */
	@XmlElement(name = "id")
	private String targetId;
	/**
	 * 群聊|单聊
	 */
	@XmlElement(name = "type")
	private String chatType;

	public String getTargetId() {
		return targetId;
	}

	public String getChatType() {
		return chatType;
	}

	@XmlTransient
	public ChatType getFormatChatType() {
		return ChatType.valueOf(chatType);
	}

	@Override
	public String toString() {
		return "ChatReceiver [targetId=" + targetId + ", chatType=" + chatType
				+ "]";
	}

}
