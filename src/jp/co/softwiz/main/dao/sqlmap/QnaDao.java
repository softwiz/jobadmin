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

import jp.co.softwiz.main.domain.admin.QnaInfoBean;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jk-yun@softwiz.jp
 * @version
 */
public class QnaDao extends SqlSessionDaoSupport {

	@Autowired protected SqlSessionTemplate sqlSessionTemplate;

	public List<QnaInfoBean> selectList(QnaInfoBean bean){
		return sqlSessionTemplate.selectList("Qna.selectList", bean);
	}

	public QnaInfoBean select(QnaInfoBean bean) {
		return sqlSessionTemplate.selectOne("jp.co.softwiz.main.mapper.TQnaInfoMapper.selectByPrimaryKey", bean);
	}

	public void insert(QnaInfoBean bean) {
		sqlSessionTemplate.insert("jp.co.softwiz.main.mapper.TQnaInfoMapper.insert", bean);
	}

	public void update(QnaInfoBean bean) {
		sqlSessionTemplate.update("jp.co.softwiz.main.mapper.TQnaInfoMapper.updateByPrimaryKeySelective", bean);
	}

	public void delete(QnaInfoBean bean) {
		sqlSessionTemplate.delete("jp.co.softwiz.main.mapper.TQnaInfoMapper.deleteByPrimaryKey", bean);
	}
}
