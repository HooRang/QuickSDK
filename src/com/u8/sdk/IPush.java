package com.u8.sdk;

/**
 * 推送接口
 * @author xiaohei
 *
 */
public interface IPush extends IPlugin{

	public static final int PLUGIN_TYPE = Constants.PLUGIN_TYPE_PUSH;

	public void scheduleNotification(String msgs);
	
	public void startPush();
	
	public void stopPush();
	
	public void addTags(String...tags);
	
	public void removeTags(String...tag);
	
	public void addAlias(String alias);
	
	public void removeAlias(String alias);
}
