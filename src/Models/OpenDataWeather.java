package Models;

import java.util.ArrayList;

public class OpenDataWeather {
	
	
	
	private class Codebeautify {
		Response ResponseObject;

		public Response getResponse() {
			return ResponseObject;
		}

		public void setResponse(Response responseObject) {
			this.ResponseObject = responseObject;
		}
	}

	private class Response {
		Header HeaderObject;
		Body BodyObject;

		// Getter Methods

		public Header getHeader() {
			return HeaderObject;
		}

		public Body getBody() {
			return BodyObject;
		}

		// Setter Methods

		public void setHeader(Header headerObject) {
			this.HeaderObject = headerObject;
		}

		public void setBody(Body bodyObject) {
			this.BodyObject = bodyObject;
		}
	}

	private class Body {
		Items ItemsObject;
		private float numOfRows;
		private float pageNo;
		private float totalCount;

		// Getter Methods

		public Items getItems() {
			return ItemsObject;
		}

		public float getNumOfRows() {
			return numOfRows;
		}

		public float getPageNo() {
			return pageNo;
		}

		public float getTotalCount() {
			return totalCount;
		}

		// Setter Methods

		public void setItems(Items itemsObject) {
			this.ItemsObject = itemsObject;
		}

		public void setNumOfRows(float numOfRows) {
			this.numOfRows = numOfRows;
		}

		public void setPageNo(float pageNo) {
			this.pageNo = pageNo;
		}

		public void setTotalCount(float totalCount) {
			this.totalCount = totalCount;
		}
	}

	private class Items {
		ArrayList<Object> item = new ArrayList<Object>();

	}

	private class Header {
		private String resultCode;
		private String resultMsg;

		public String getResultCode() {
			return resultCode;
		}

		public String getResultMsg() {
			return resultMsg;
		}

		public void setResultCode(String resultCode) {
			this.resultCode = resultCode;
		}

		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}
	}
}
