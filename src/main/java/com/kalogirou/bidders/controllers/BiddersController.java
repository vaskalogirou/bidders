package com.kalogirou.bidders.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BiddersController {
	@RequestMapping(method = RequestMethod.POST, value = "/getResponseFromFirstBidder")
	public String getResponseFromFirstBidder() throws InterruptedException {
		Thread.sleep(2000);
		return "{\"id\":\"e7fe51ce4f6376876353ff0961c2cb0d\",\"bid\":{\"campaignId\":\"5a3dce46\",\"price\":1,\"adm\":\"<a href=\\\"http://example.com/click/qbFCjzXR9rkf8qa4\\\"><img src=\\\"http://assets.example.com/ad_assets/files/000/000/002/original/banner_300_250.png\\\" height=\\\"250\\\" width=\\\"300\\\" alt=\\\"\\\"/></a><img src=\\\"http://example.com/win/qbFCjzXR9rkf8qa4\\\" height=\\\"1\\\" width=\\\"1\\\" alt=\\\"\\\"/>\"}}";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/getResponseFromSecondBidder")
	public String getResponseFromSecondBidder() throws InterruptedException {
		Thread.sleep(2000);
		return "{\"id\":\"e7fe51ce4f6376876353ff0961c2cb0d\",\"bid\":{\"campaignId\":\"5a3dce46\",\"price\":1.1,\"adm\":\"<a href=\\\"http://example.com/click/qbFCjzXR9rkf8qa4\\\"><img src=\\\"http://assets.example.com/ad_assets/files/000/000/002/original/banner_300_250.png\\\" height=\\\"250\\\" width=\\\"300\\\" alt=\\\"\\\"/></a><img src=\\\"http://example.com/win/qbFCjzXR9rkf8qa4\\\" height=\\\"1\\\" width=\\\"1\\\" alt=\\\"\\\"/>\"}}";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/getResponseFromThirdBidder")
	public String getResponseFromThirdBidder() throws InterruptedException {
		Thread.sleep(2000);
		return "{\"id\":\"e7fe51ce4f6376876353ff0961c2cb0d\",\"bid\":{\"campaignId\":\"5a3dce46\",\"price\":1.2,\"adm\":\"<a href=\\\"http://example.com/click/qbFCjzXR9rkf8qa4\\\"><img src=\\\"http://assets.example.com/ad_assets/files/000/000/002/original/banner_300_250.png\\\" height=\\\"250\\\" width=\\\"300\\\" alt=\\\"\\\"/></a><img src=\\\"http://example.com/win/qbFCjzXR9rkf8qa4\\\" height=\\\"1\\\" width=\\\"1\\\" alt=\\\"\\\"/>\"}}";
	}
}
