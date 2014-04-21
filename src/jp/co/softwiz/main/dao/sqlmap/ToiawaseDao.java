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

import jp.co.softwiz.main.domain.admin.ToiawaseInfoBean;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jk-yun@softwiz.jp
 * @version
 */
public class ToiawaseDao extends SqlSessionDaoSupport {

	@Autowired protected SqlSessionTemplate sqlSessionTemplate;

	public List<ToiawaseInfoBean> selectList(ToiawaseInfoBean bean){
		return sqlSessionTemplate.selectList("Toiawase.selectList", bean);
	}

	public ToiawaseInfoBean select(ToiawaseInfoBean bean) {
		return sqlSessionTemplate.selectOne("jp.co.softwiz.main.mapper.TToiawaseInfoMapper.selectByPrimaryKey", bean);
	}

	public void insert(ToiawaseInfoBean bean) {
		sqlSessionTemplate.insert("jp.co.softwiz.main.mapper.TToiawaseInfoMapper.insert", bean);
	}

	public void update(ToiawaseInfoBean bean) {
		sqlSessionTemplate.update("jp.co.softwiz.main.mapper.TToiawaseInfoMapper.updateByPrimaryKeySelective", bean);
	}

	public void delete(ToiawaseInfoBean bean) {
		sqlSessionTemplate.delete("jp.co.softwiz.main.mapper.TToiawaseInfoMapper.deleteByPrimaryKey", bean);
	}
}
