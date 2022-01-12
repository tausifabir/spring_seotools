package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class CategoryGroups {
    private BestPracticesBrowserCompat bestPracticesTrustSafety;
    private BestPracticesBrowserCompat bestPracticesBrowserCompat;
    private A11YAria a11YAudioVideo;
    private A11YAria seoCrawl;
    private A11YAria a11YNamesLabels;
    private BestPracticesBrowserCompat bestPracticesGeneral;
    private A11YAria a11YAria;
    private BestPracticesBrowserCompat pwaOptimized;
    private BestPracticesBrowserCompat metrics;
    private A11YAria diagnostics;
    private A11YAria a11YTablesLists;
    private A11YAria loadOpportunities;
    private A11YAria budgets;
    private A11YAria a11YLanguage;
    private BestPracticesBrowserCompat pwaInstallable;
    private A11YAria seoContent;
    private A11YAria a11YNavigation;
    private BestPracticesBrowserCompat bestPracticesUX;
    private A11YAria seoMobile;
    private A11YAria a11YColorContrast;
    private A11YAria a11YBestPractices;

    @JsonProperty("best-practices-trust-safety")
    public BestPracticesBrowserCompat getBestPracticesTrustSafety() { return bestPracticesTrustSafety; }
    @JsonProperty("best-practices-trust-safety")
    public void setBestPracticesTrustSafety(BestPracticesBrowserCompat value) { this.bestPracticesTrustSafety = value; }

    @JsonProperty("best-practices-browser-compat")
    public BestPracticesBrowserCompat getBestPracticesBrowserCompat() { return bestPracticesBrowserCompat; }
    @JsonProperty("best-practices-browser-compat")
    public void setBestPracticesBrowserCompat(BestPracticesBrowserCompat value) { this.bestPracticesBrowserCompat = value; }

    @JsonProperty("a11y-audio-video")
    public A11YAria getA11YAudioVideo() { return a11YAudioVideo; }
    @JsonProperty("a11y-audio-video")
    public void setA11YAudioVideo(A11YAria value) { this.a11YAudioVideo = value; }

    @JsonProperty("seo-crawl")
    public A11YAria getSEOCrawl() { return seoCrawl; }
    @JsonProperty("seo-crawl")
    public void setSEOCrawl(A11YAria value) { this.seoCrawl = value; }

    @JsonProperty("a11y-names-labels")
    public A11YAria getA11YNamesLabels() { return a11YNamesLabels; }
    @JsonProperty("a11y-names-labels")
    public void setA11YNamesLabels(A11YAria value) { this.a11YNamesLabels = value; }

    @JsonProperty("best-practices-general")
    public BestPracticesBrowserCompat getBestPracticesGeneral() { return bestPracticesGeneral; }
    @JsonProperty("best-practices-general")
    public void setBestPracticesGeneral(BestPracticesBrowserCompat value) { this.bestPracticesGeneral = value; }

    @JsonProperty("a11y-aria")
    public A11YAria getA11YAria() { return a11YAria; }
    @JsonProperty("a11y-aria")
    public void setA11YAria(A11YAria value) { this.a11YAria = value; }

    @JsonProperty("pwa-optimized")
    public BestPracticesBrowserCompat getPwaOptimized() { return pwaOptimized; }
    @JsonProperty("pwa-optimized")
    public void setPwaOptimized(BestPracticesBrowserCompat value) { this.pwaOptimized = value; }

    @JsonProperty("metrics")
    public BestPracticesBrowserCompat getMetrics() { return metrics; }
    @JsonProperty("metrics")
    public void setMetrics(BestPracticesBrowserCompat value) { this.metrics = value; }

    @JsonProperty("diagnostics")
    public A11YAria getDiagnostics() { return diagnostics; }
    @JsonProperty("diagnostics")
    public void setDiagnostics(A11YAria value) { this.diagnostics = value; }

    @JsonProperty("a11y-tables-lists")
    public A11YAria getA11YTablesLists() { return a11YTablesLists; }
    @JsonProperty("a11y-tables-lists")
    public void setA11YTablesLists(A11YAria value) { this.a11YTablesLists = value; }

    @JsonProperty("load-opportunities")
    public A11YAria getLoadOpportunities() { return loadOpportunities; }
    @JsonProperty("load-opportunities")
    public void setLoadOpportunities(A11YAria value) { this.loadOpportunities = value; }

    @JsonProperty("budgets")
    public A11YAria getBudgets() { return budgets; }
    @JsonProperty("budgets")
    public void setBudgets(A11YAria value) { this.budgets = value; }

    @JsonProperty("a11y-language")
    public A11YAria getA11YLanguage() { return a11YLanguage; }
    @JsonProperty("a11y-language")
    public void setA11YLanguage(A11YAria value) { this.a11YLanguage = value; }

    @JsonProperty("pwa-installable")
    public BestPracticesBrowserCompat getPwaInstallable() { return pwaInstallable; }
    @JsonProperty("pwa-installable")
    public void setPwaInstallable(BestPracticesBrowserCompat value) { this.pwaInstallable = value; }

    @JsonProperty("seo-content")
    public A11YAria getSEOContent() { return seoContent; }
    @JsonProperty("seo-content")
    public void setSEOContent(A11YAria value) { this.seoContent = value; }

    @JsonProperty("a11y-navigation")
    public A11YAria getA11YNavigation() { return a11YNavigation; }
    @JsonProperty("a11y-navigation")
    public void setA11YNavigation(A11YAria value) { this.a11YNavigation = value; }

    @JsonProperty("best-practices-ux")
    public BestPracticesBrowserCompat getBestPracticesUX() { return bestPracticesUX; }
    @JsonProperty("best-practices-ux")
    public void setBestPracticesUX(BestPracticesBrowserCompat value) { this.bestPracticesUX = value; }

    @JsonProperty("seo-mobile")
    public A11YAria getSEOMobile() { return seoMobile; }
    @JsonProperty("seo-mobile")
    public void setSEOMobile(A11YAria value) { this.seoMobile = value; }

    @JsonProperty("a11y-color-contrast")
    public A11YAria getA11YColorContrast() { return a11YColorContrast; }
    @JsonProperty("a11y-color-contrast")
    public void setA11YColorContrast(A11YAria value) { this.a11YColorContrast = value; }

    @JsonProperty("a11y-best-practices")
    public A11YAria getA11YBestPractices() { return a11YBestPractices; }
    @JsonProperty("a11y-best-practices")
    public void setA11YBestPractices(A11YAria value) { this.a11YBestPractices = value; }
}
