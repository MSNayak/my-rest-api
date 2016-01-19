package com.tbs.ecm.util;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tbs.ecm.domain.User;
import com.tbs.ecm.vo.UserRestTJVO;

public class RestUtil {
	public static JsonNode getJsonNode(String data) {
		JsonNode node = null;
		if (data != null && data.length() > 0) {
			ObjectMapper objectMapper = new ObjectMapper();
			try {
				node = objectMapper.readValue(data, JsonNode.class);
			} catch (JsonParseException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return node;
	}

	public static UserRestTJVO fromUser(User user) {
		UserRestTJVO uservo = new UserRestTJVO();
		if (user != null) {
			try {
				// BeanUtils.copyProperties(uservo, user);
				uservo.setLoginId(user.getLoginId());
				uservo.setGender(user.getGender());
				uservo.setAgent(user.getAgent());
				uservo.setLoginEmail(user.getEmail3());
				uservo.setCommunicationEmail(user.getEmail2());
				uservo.setLastLoginDate(DateUtil.parseDate(
						user.getLastLoginDate(),
						DateUtil.Format.MMM_DD_YYYY_HHMMSS));
				uservo.setLoginCreateDate(DateUtil.parseDate(
						user.getLoginCreateDate(),
						DateUtil.Format.MMM_DD_YYYY_HHMMSS));
				uservo.setPsExpiryDate(DateUtil.parseDate(
						user.getPsExpiryDate(),
						DateUtil.Format.MMM_DD_YYYY_HHMMSS));
				uservo.setPrevModifiedTime(DateUtil.parseDate(
						user.getPrevModifiedTime(),
						DateUtil.Format.MMM_DD_YYYY_HHMMSS));
				uservo.setLastName(user.getLastName());
				uservo.setFirstName(user.getFirstName());
				uservo.setRegistrationSource(user.getRegistrationSource());
				uservo.setDateOfBirth(DateUtil.parseDate(user.getDob(),
						DateUtil.Format.MMM_DD_YYYY_HHMMSS));
				uservo.setMobileNumber(user.getTelOther());
				uservo.setUsrNetStatus(user.getNetStatus());
				uservo.setAddress(user.getAddress1());
				uservo.setLastModifiedTime(DateUtil.parseDate(
						user.getLastModifiedTime(),
						DateUtil.Format.MMM_DD_YYYY_HHMMSS));
				uservo.setLoginSrNo(user.getLoginSrlNo());
				uservo.setLfCountry(user.getCountry());
				uservo.setMobileVerified(user.getIsMobileVerified());
			} catch (Exception e) {
				e.printStackTrace();
				uservo.setErrorMsg(e.getMessage());
				uservo.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
			}
		} else {
			uservo.setErrorMsg("User not found.");
			uservo.setErrorCode(HttpStatus.NOT_FOUND.value());
		}

		return uservo;
	}

	public static <T> T fromJsonNode(JsonNode node, Class<T> myClass) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
				false);
		try {
			return mapper.treeToValue(node, myClass);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate
				.getForObject(
						"http://candqc.timesjobs.com/candidate/userLoginDetails.json?userId=testanoop@test.com&source=jb",
						String.class);
		System.out.println(result);
	}
}
