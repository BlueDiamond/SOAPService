package com.bd.soap.cxf.dao.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.TimeZone;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bd.soap.cxf.util.BdConstants;

@MappedTypes(value = Timestamp.class)
public class SqlTimestampTypeHandler extends BaseTypeHandler {
	private static Logger logger = LoggerFactory.getLogger(SqlTimestampTypeHandler.class);

	public void setNonNullParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
		logger.debug("Setting TimeZone info in EST");
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(BdConstants.US_EST_TIMEZONE_STRING));
		ps.setTimestamp(i, (Timestamp) parameter, calendar);
	}

	@Override
	public Object getNullableResult(ResultSet rs, String columnName) throws SQLException {
		// logger.debug("Getting TimeZone info in EST");
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(BdConstants.US_EST_TIMEZONE_STRING));
		return rs.getTimestamp(columnName, calendar);
	}

	@Override
	public Timestamp getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		// logger.debug("Getting TimeZone info in EST");
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(BdConstants.US_EST_TIMEZONE_STRING));
		return cs.getTimestamp(columnIndex, calendar);
	}

	@Override
	public Object getNullableResult(ResultSet rs, int index) throws SQLException {
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(BdConstants.US_EST_TIMEZONE_STRING));
		return rs.getTimestamp(index, calendar);
	}

}
