package com.PeluqueriaWeb.Master.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ViewsAdmin {


    @GetMapping("/index_admin")
    public RedirectView RedirectIndex() {
        return new RedirectView("/admin/index.html");
    }
    @GetMapping("/about-us")
    public RedirectView RedirectAboutUs() {
        return new RedirectView("/admin/about-us.html");
    }
    @GetMapping("/accepted-appointement")
    public RedirectView RedirectacceptedAppointment() {
        return new RedirectView("/admin/accepted-appointment.html");
    }
    @GetMapping("/add-customer")
    public RedirectView RedirectAddCustomer() {
        return new RedirectView("/admin/add-customer.html");
    }
    @GetMapping("/add-customer-services")
    public RedirectView RedirectAddCustomerServices() {
        return new RedirectView("/admin/add-customer-services.html");
    }
    @GetMapping("/add-services")
    public RedirectView RedirectAddServices() {
        return new RedirectView("/admin/add-services.html");
    }
    @GetMapping("/admin-profile")
    public RedirectView RedirectAdminProfile() {
        return new RedirectView("/admin/admin-profile.html");
    }
    @GetMapping("/all-appointment")
    public RedirectView RedirectAllAppointment() {
        return new RedirectView("/admin/all-appointment.html");
    }
    @GetMapping("/bwdates-reports-details")
    public RedirectView RedirectBwdatesReportsDetails() {
        return new RedirectView("/admin/bwdates-reports-details.html");
    }
    @GetMapping("/bwdates-reports-ds")
    public RedirectView RedirectBwdatesReportsDs() {
        return new RedirectView("/admin/bwdates-reports-ds.html");
    }
    @GetMapping("/change-password")
    public RedirectView RedirectChangePassword() {
        return new RedirectView("/admin/Change-password.html");
    }
    @GetMapping("/contact-us")
    public RedirectView RedirectContactUs() {
        return new RedirectView("/admin/contact-us.html");
    }
    @GetMapping("/customer-list")
    public RedirectView RedirectCustomerList() {
        return new RedirectView("/admin/customer-list.html");
    }
    @GetMapping("/dash-index")
    public RedirectView RedirectDashIndex() {
        return new RedirectView("/admin/dash-index.html");
    }
    @GetMapping("/dashboard")
    public RedirectView RedirectDashboard() {
        return new RedirectView("/admin/dashboard.html");
    }
    @GetMapping("/edit-appointment")
    public RedirectView RedirectEditAppointment() {
        return new RedirectView("/admin/edit-appointment.html");
    }
    @GetMapping("/edit-customer-deatiled")
    public RedirectView RedirectEditCustomerDeatiled() {
        return new RedirectView("/admin/edit-customer-deatiled.html");
    }
    @GetMapping("/edit-services")
    public RedirectView RedirectEditServices() {
        return new RedirectView("/admin/edit-services.html");
    }
    @GetMapping("/forgot-password")
    public RedirectView RedirectForgotPassword() {
        return new RedirectView("/admin/forgot-password.html");
    }
    @GetMapping("/index")
    public RedirectView Redirectindex() {
        return new RedirectView("/admin/index.html");
    }
    @GetMapping("/invoices")
    public RedirectView RedirectInvoices() {
        return new RedirectView("/admin/invoices.html");
    }
    @GetMapping("/logout")
    public RedirectView RedirectLogOut() {
        return new RedirectView("/admin/logout.html");
    }
    @GetMapping("/manage-services")
    public RedirectView RedirectManageServices() {
        return new RedirectView("/admin/manage-services.html");
    }
    @GetMapping("/new-appointment")
    public RedirectView RedirectNewAppointment() {
        return new RedirectView("/admin/new-appointment.html");
    }
    @GetMapping("/rejected-appointment")
    public RedirectView RedirectRejectedAppointment() {
        return new RedirectView("/admin/rejected-appointment.html");
    }
    @GetMapping("/reset-password")
    public RedirectView RedirectResetPassword() {
        return new RedirectView("/admin/reset-password.html");
    }
    @GetMapping("/sales-reports")
    public RedirectView RedirectSalesReports() {
        return new RedirectView("/admin/sales-reports.html");
    }
    @GetMapping("/sales-reports-detail")
    public RedirectView RedirectSalesReportsDetail() {
        return new RedirectView("/admin/sales-reports-detail.html");
    }
    @GetMapping("/search-appointment")
    public RedirectView RedirectSearchAppointment() {
        return new RedirectView("/admin/search-appointment.html");
    }
    @GetMapping("/search-invoices")
    public RedirectView RedirectHome() {
        return new RedirectView("/admin/search-invoices.html");
    }
    @GetMapping("/view-appointment")
    public RedirectView RedirectViewAppointment() {
        return new RedirectView("/admin/view-appointment.html");
    }
    @GetMapping("/view-invoice")
    public RedirectView RedirectViewInvoice() {
        return new RedirectView("/admin/view-invoice.html");
    }
}