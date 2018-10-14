package com.invoice.system.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InvoiceController {

    @RequestMapping("/new-invoice")
    public String newInvoice() {
        return "/WEB-INF/new-invoice.jsp";
    }
}
