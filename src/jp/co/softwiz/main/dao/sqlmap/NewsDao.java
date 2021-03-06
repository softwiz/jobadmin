/*
	 * タイトル：カテゴリDaoImpl
	 * 説明    ：
	 *
	 * 著作権  ：Copyright(c) 2014 SOFTWIZ
	 * 会社名  ：株式会社 SOFTWIZ
	 *
	 * 変更履歴   ：2014/04/03
	 * 新規登録   :
*/

package jp.co.softwiz.main.dao.sqlmap;

import java.util.List;

import jp.co.softwiz.main.domain.admin.NewsInfoBean;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jk-yun@softwiz.jp
 * @version
 */
public class NewsDao extends SqlSessionDaoSupport {

	@Autowired protected SqlSessionTemplate sqlSessionTemplate;

	public List<NewsInfoBean> selectList(NewsInfoBean bean){
		return sqlSessionTemplate.selectList("News.selectList", bean);
	}

	public NewsInfoBean select(NewsInfoBean bean) {
		return sqlSessionTemplate.selectOne("jp.co.softwiz.main.mapper.TNewsInfoMapper.selectByPrimaryKey", bean);
	}

	public void insert(NewsInfoBean bean) {
		sqlSessionTemplate.insert("jp.co.softwiz.main.mapper.TNewsInfoMapper.insert", bean);
	}

	public void update(NewsInfoBean bean) {
		sqlSessionTemplate.update("jp.co.softwiz.main.mapper.TNewsInfoMapper.updateByPrimaryKeySelective", bean);
	}

	public void delete(NewsInfoBean bean) {
		sqlSessionTemplate.delete("jp.co.softwiz.main.mapper.TNewsInfoMapper.deleteByPrimaryKey", bean);
	}
}
