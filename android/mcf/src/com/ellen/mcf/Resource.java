
package com.ellen.mcf;

import android.content.Context;
import com.ellen.mcf.R.string;

public class Resource {

	/**
	 * @brief:	获取 mcf 版本的资源Id	  
	 * @return: int 	mcf版本的资源Id	  
	 * @note 
	 */
	public static int mcfVersionResourcesId()
	{
		return string.frameworkVersion;
	}
	
	/**
	 * @brief:	获取 mcf 版本	
	 * @param:  Context 获取资源需要的上下文信息  
	 * @return: String 	mcf 版本	  
	 * @note 
	 */
	public static String mcfVersion(Context context)
	{
		return resourceStringValue(mcfVersionResourcesId(), context);
	}
	
	/**
	 * @brief:	获取 mcf 名称的资源Id	  
	 * @return: int 	获取 mcf 名称的资源Id	  
	 * @note 
	 */
	public static int mcfNameResourcesId()
	{
		return string.frameworkName;
	}
	
	/**
	 * @brief:	获取 mcf 名称	
	 * @param:  Context 获取资源需要的上下文信息  
	 * @return: String 	mcf名称	  
	 * @note 
	 */
	public static String mcfName(Context context)
	{
		return resourceStringValue(mcfNameResourcesId(), context);
	}
	
	/**
	 * @brief:	获取 company 名称的资源Id	  
	 * @return: int 	获取 company 名称的资源Id	  
	 * @note 
	 */
	public static int  companyResourceId() 
	{
		return string.company;
	}
	
	/**
	 * @brief:	获取 company 名称	
	 * @param:  Context 获取资源需要的上下文信息  
	 * @return: String 	company名称	  
	 * @note 
	 */
	public static String company(Context context)
	{
		return resourceStringValue(companyResourceId(), context);
	}
	
	/**
	 * @brief:	获取 companyDescription 名称的资源Id	  
	 * @return: int 	获取 companyDescription 名称的资源Id	  
	 * @note 
	 */
	public static int companyDescriptionResourceId()
	{
		return string.companyDescription;
	}
	
	/**
	 * @brief:	获取 companyDescription 名称	
	 * @param:  Context 获取资源需要的上下文信息  
	 * @return: String 	companyDescription名称	  
	 * @note 
	 */
	public static String companyDescription(Context context)
	{
		return resourceStringValue(companyDescriptionResourceId(), context);
	}
	
	/**
	 * @brief:	获取资源的String value	
	 * @param: resourceId 资源 id
	 * @param:  context 获取资源需要的上下文信息  
	 * @return: String  资源的String value  
	 * @note 
	 */
	private static String resourceStringValue(int resourceId, Context context)
	{
		if(context == null)
		{
			return null;
		}
				
		return context.getResources().getString(resourceId);				
	}
}
