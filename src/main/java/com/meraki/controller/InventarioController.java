package com.meraki.controller;

import com.meraki.entity.Inventario;
import com.meraki.entity.Product;
import com.meraki.service.InventarioService;
import com.meraki.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;

    @Autowired
    private ProductService productService;

    @GetMapping("/inventario")
    public String listInventario(Model model) {
        model.addAttribute("inventarios", inventarioService.getAllInventarios());
        return "inventario_list";
    }

    @GetMapping("/inventario/new")
    public String showCreateInventarioForm(Model model) {
        model.addAttribute("inventario", new Inventario());
        model.addAttribute("products", productService.getAllProducts());
        return "create_inventario";
    }

    @PostMapping("/inventario")
    public String createInventario(Inventario inventario) {
        inventarioService.saveInventario(inventario);
        return "redirect:/inventario";
    }

    @GetMapping("/inventario/edit/{id}")
    public String showEditInventarioForm(@PathVariable("id") Long id, Model model) {
        Inventario inventario = inventarioService.getInventarioById(id);
        model.addAttribute("inventario", inventario);
        model.addAttribute("products", productService.getAllProducts());
        return "edit_inventario";
    }

    @PostMapping("/inventario/update/{id}")
    public String updateInventario(@PathVariable("id") Long id, Inventario inventario) {
        inventarioService.saveInventario(inventario);
        return "redirect:/inventario";
    }

    @GetMapping("/inventario/delete/{id}")
    public String deleteInventario(@PathVariable("id") Long id) {
        inventarioService.deleteInventario(id);
        return "redirect:/inventario";
    }
}