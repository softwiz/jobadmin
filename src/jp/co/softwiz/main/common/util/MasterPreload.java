/*
	 * タイトル：カテゴリサービス
	 * 説明    ：カテゴリサービス
	 *
	 * 著作権  ：Copyright(c) 2014 SOFTWIZ
	 * 会社名  ：株式会社 SOFTWIZ
	 *
	 * 変更履歴   ：2014/04/03
	 * 新規登録   :
*/

package jp.co.softwiz.main.common.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;


/**
 * @author jk-yun@softwiz.jp
 * @version 0.1
 *
 */
public class MasterPreload {

	@Autowired
    private WebApplicationContext applicationContext;

	@SuppressWarnings("rawtypes")
	public void init(){
		String[] beanNames = applicationContext.getBeanNamesForType(AbstractCache.class);
        for (String beanName : beanNames) {
            AbstractCache cache = (AbstractCache) applicationContext.getBean(beanName);
            cache.reload();
        }

	}

}
